package com.ljq.blog.controller;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.ljq.blog.po.BlogTBlogfile;
import com.ljq.blog.po.BlogTBlogfileCustom;
import com.ljq.blog.service.BlogfileService;
import com.ljq.blog.util.DateUtil;
import com.ljq.blog.util.QiNiuCos;

@Controller
@RequestMapping("blogfile")
public class BlogfileController {

	/*
	 * @Autowired private TencentCloudCos tencentCloudCos;
	 */

	@Autowired
	private QiNiuCos qiNiuCos;

	@Autowired
	private BlogfileService blogfileService;

	/**
	 * @param id
	 *            哪个博客上传的文件，博客的id
	 * @param blogFile
	 *            接收商品文件
	 * @throws Exception
	 */
	@RequestMapping(value = "saveBlogFile", produces = "application/json; charset=utf-8")
	public @ResponseBody String saveBlogFile(String type, String id, MultipartFile blogFile,
			@CookieValue("blogId") String blogId) throws Exception {
		System.out.println("进来了 " + id + " 这是id");
		String data = null;
		if (blogFile != null) {
			String nowDate = DateUtil.GetNowDate();
			String nowFileName = id + "-" + type + "-" + nowDate + "-" + UUID.randomUUID() + "-"
					+ blogFile.getOriginalFilename();
			// data = tencentCloudCos.uploadFile(nowFileName,
			// blogFile.getSize(), blogFile.getInputStream());
			data = qiNiuCos.upload(nowFileName, blogFile.getInputStream());
			String url = "http://file.itstudying.com/" + nowFileName;
			BlogTBlogfileCustom blogTBlogfile = new BlogTBlogfileCustom();
			blogTBlogfile.setBlogid(blogId);
			blogTBlogfile.setFilepath(url);
			blogTBlogfile.setClassify("file");
			blogfileService.insert(blogTBlogfile);

		}

		return "{\"status\":\"true\",\"data\":" + data + "}";
	}

	// 设置返回json格式的编码，否则上传文件名如有中文会乱码
	@RequestMapping(value = "saveBlogArticleFile", produces = "application/json; charset=utf-8")
	public @ResponseBody String saveBlogArticleFile(MultipartFile upfile, HttpServletRequest request,
			@CookieValue("blogId") String blogId) throws Exception {

		String json = "{\"state\": \"SUCCESS\"}";
		System.out.println(json);
		if (upfile != null) {
			System.out.println("not null");

			String nowDate = DateUtil.GetNowDate();
			// 将上传后保存的文件名设置为博客的id和当前日期和随机数和原始文件名，并接收上传后返回的信息
			String nowFileName = blogId + "-" + "articleFile" + "-" + nowDate + "-" + UUID.randomUUID() + "-"
					+ upfile.getOriginalFilename();
			qiNiuCos.upload(nowFileName, upfile.getInputStream());

			String url = "http://file.itstudying.com/" + nowFileName;
			BlogTBlogfile blogTBlogfile = new BlogTBlogfile();
			blogTBlogfile.setBlogid(blogId);
			blogTBlogfile.setFilepath(url);
			blogTBlogfile.setClassify("other");
			blogfileService.insert(blogTBlogfile);

			// 设置返回的信息，
			json = "{\"state\": \"SUCCESS\",\"original\": \"" + nowFileName + "\",\"size\": \"" + upfile.getSize()
					+ "\",\"title\": \"" + nowFileName + "\",\"type\": \""
					+ nowFileName.substring(nowFileName.lastIndexOf(".") + 1) + "\",\"url\": \"" + url + "\"}";
			System.out.println(json);
		}

		return json;
	}
}
