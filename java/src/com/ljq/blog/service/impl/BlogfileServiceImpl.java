package com.ljq.blog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.ljq.blog.mapper.BlogTBlogfileMapper;
import com.ljq.blog.mapper.BlogTBlogfileMapperCustom;
import com.ljq.blog.po.BlogTBlog;
import com.ljq.blog.po.BlogTBlogfile;
import com.ljq.blog.po.BlogTBlogfileCustom;
import com.ljq.blog.service.BlogfileService;

public class BlogfileServiceImpl implements BlogfileService {

	@Autowired
	private BlogTBlogfileMapper blogTBlogfileMapper;
	
	@Autowired
	private BlogTBlogfileMapperCustom blogTBlogfileMapperCustom;

	@Override
	public int insert(BlogTBlogfile blogTBlogfile) {
		// TODO Auto-generated method stub
		return blogTBlogfileMapper.insert(blogTBlogfile);
	}

	@Override
	public BlogTBlogfileCustom selectFirstFileByBlogId(BlogTBlog blog) {
		// TODO Auto-generated method stub
		return blogTBlogfileMapperCustom.selectFirstFileByBlogId(blog);
	}

}
