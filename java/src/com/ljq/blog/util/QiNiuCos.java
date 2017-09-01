package com.ljq.blog.util;

import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;

import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.BucketManager;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.FileInfo;
import com.qiniu.util.Auth;
import com.qiniu.util.StringMap;

public class QiNiuCos {

	private String accessKey;
	private String secretKey;
	private String bucket;

	public String getAccessKey() {
		return accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public String getSecretKey() {
		return secretKey;
	}

	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

	public String getBucket() {
		return bucket;
	}

	public void setBucket(String bucket) {
		this.bucket = bucket;
	}

	/**
	 * 
	 * 将文件上传至七牛云存储
	 * 
	 * @param nowFileName
	 *            存储在七牛云的文件名称
	 * @param inputStream
	 *            文件的IO流
	 * @return 上传后七牛云返回的json字符串
	 */
	public String upload(String nowFileName, InputStream inputStream) {
		// 构造一个带指定Zone对象的配置类
		Configuration cfg = new Configuration(Zone.zone2());
		// ...其他参数参考类注释
		UploadManager uploadManager = new UploadManager(cfg);
		// ...生成上传凭证，然后准备上传

		// 默认不指定key的情况下，以文件内容的hash值作为文件名
		String key = nowFileName;
		StringMap putPolicy = new StringMap();
		// key：获得文件保存在空间中的资源名。fsize：资源尺寸，单位为字节。ext：上传资源的后缀名，
		putPolicy.put("returnBody", "{\"key\":\"$(key)\",\"hash\":\"$(etag)\",\"ext\":\"$(ext)\",\"fsize\":$(fsize)}");
		Auth auth = Auth.create(accessKey, secretKey);
		String upToken = auth.uploadToken(bucket, null, 3600, putPolicy);

		String responseStr = null;
		try {
			Response response = uploadManager.put(inputStream, key, upToken, null, null);
			responseStr = response.bodyString();
		} catch (QiniuException ex) {
			Response r = ex.response;
			System.err.println(r.toString());
			try {
				System.err.println(r.bodyString());
			} catch (QiniuException ex2) {
				// ignore
				ex2.printStackTrace();
			}
		}
		return responseStr;
	}

	/**
	 * 
	 * 根据博客的ID获得次博客在七牛云上存放的所有的文件，事实是根据文件的前缀查询
	 * 
	 * @param blogId
	 *            博客的ID
	 */
	public List<String> getFileKeyList(String blogId) {
		// 构造一个带指定Zone对象的配置类
		Configuration cfg = new Configuration(Zone.zone0());
		Auth auth = Auth.create(accessKey, secretKey);
		BucketManager bucketManager = new BucketManager(auth, cfg);
		// 文件名前缀
		String prefix = blogId;
		// 每次迭代的长度限制，最大1000，推荐值 1000
		int limit = 1000;
		// 指定目录分隔符，列出所有公共前缀（模拟列出目录效果）。缺省值为空字符串
		String delimiter = "";
		// 列举空间文件列表
		BucketManager.FileListIterator fileListIterator = bucketManager.createFileListIterator(bucket, prefix, limit,
				delimiter);
		List<String> strings = new LinkedList<>();
		while (fileListIterator.hasNext()) {
			// 处理获取的file list结果
			FileInfo[] items = fileListIterator.next();
			for (FileInfo item : items) {
				strings.add(item.key);
			}
		}

		return strings;
	}

	/**
	 * 
	 * 根据文件的名称删除指定的文件
	 * 
	 * @param key
	 *            文件的名称
	 */
	public void deleteFile(List<String> keyList) {
		// 构造一个带指定Zone对象的配置类
		Configuration cfg = new Configuration(Zone.zone0());
		// ...其他参数参考类注释
		Auth auth = Auth.create(accessKey, secretKey);
		BucketManager bucketManager = new BucketManager(auth, cfg);
		try {
			for (String key : keyList) {
				bucketManager.delete(bucket, key);
			}
		} catch (QiniuException ex) {
			// 如果遇到异常，说明删除失败
			System.err.println(ex.code());
			System.err.println(ex.response.toString());
		}

	}
}
