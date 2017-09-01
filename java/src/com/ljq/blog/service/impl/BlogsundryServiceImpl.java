package com.ljq.blog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.ljq.blog.mapper.BlogTBlogsundryMapper;
import com.ljq.blog.po.BlogTBlogsundry;
import com.ljq.blog.service.BlogsundryService;

public class BlogsundryServiceImpl implements BlogsundryService {

	@Autowired
	private BlogTBlogsundryMapper blogTBlogsundryMapper;

	@Override
	public int updateByPrimaryKeySelective(BlogTBlogsundry record) {

		// TODO Auto-generated method stub
		return blogTBlogsundryMapper.updateByPrimaryKeySelective(record);
	}

}
