package com.ljq.blog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ljq.blog.mapper.BlogTManagerMapper;
import com.ljq.blog.mapper.BlogTManagerMapperCustom;
import com.ljq.blog.po.BlogTManager;
import com.ljq.blog.po.BlogTManagerCustom;
import com.ljq.blog.po.BlogTManagerVo;
import com.ljq.blog.service.ManagerService;

public class ManagerServiceImpl implements ManagerService {

	@Autowired
	private BlogTManagerMapper blogTManagerMapper;

	@Autowired
	private BlogTManagerMapperCustom blogTManagerMapperCustom;

	@Override
	public BlogTManager selectByPrimaryKey(String no) throws Exception {
		// TODO Auto-generated method stub
		return blogTManagerMapper.selectByPrimaryKey(no);
	}

	@Override
	public List<BlogTManagerCustom> selectManager(BlogTManagerVo blogTManagerVo) throws Exception {
		// TODO Auto-generated method stub
		return blogTManagerMapperCustom.selectManager(blogTManagerVo);
	}
}
