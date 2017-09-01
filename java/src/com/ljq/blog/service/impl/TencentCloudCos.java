package com.ljq.blog.service.impl;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.beans.factory.annotation.Autowired;

import com.qcloud.cos.COSClient;
import com.qcloud.cos.ClientConfig;
import com.qcloud.cos.request.UploadFileRequest;
import com.qcloud.cos.sign.Credentials;

public class TencentCloudCos {
	// 设置要操作的buckets
	private String bucketName;

	public String getBucketName() {
		return bucketName;
	}

	public void setBucketName(String bucketName) {
		this.bucketName = bucketName;
	}

	public Credentials getCred() {
		return cred;
	}

	public void setCred(Credentials cred) {
		this.cred = cred;
	}
	// 初始化秘钥信息
	@Autowired
	private Credentials cred;

	private COSClient init() {

		// 初始化客户端配置
		ClientConfig clientConfig = new ClientConfig();
		// 设置bucket所在的区域，比如华南园区：gz； 华北园区：tj；华东园区：sh ；
		clientConfig.setRegion("sh");
		// 初始化cosClient
		COSClient cosClient = new COSClient(clientConfig, cred);
		return cosClient;

	}

	public String uploadFile(String cosPath, long size, InputStream inputStream) throws IOException {
		COSClient cosClient = init();// 先进行初始化
		// 将上传的文件转换成字节数组，并关闭输入流
		byte[] contentBuffer = new byte[(int) size];// 根据文件的大小常见byte数组
		inputStream.read(contentBuffer);
		inputStream.close();
		// 执行上传操作
		UploadFileRequest uploadFileRequest = new UploadFileRequest(bucketName, cosPath, contentBuffer);
		String uploadFileRet = cosClient.uploadFile(uploadFileRequest);
		cosClient.shutdown();
		return uploadFileRet;
	}
}
