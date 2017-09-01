package com.ljq.blog.mapper;

import java.util.List;

import com.ljq.blog.po.BlogTManagerCustom;
import com.ljq.blog.po.BlogTManagerVo;

public interface BlogTManagerMapperCustom {
	List<BlogTManagerCustom> selectManager(BlogTManagerVo blogTManagerVo) throws Exception;
}