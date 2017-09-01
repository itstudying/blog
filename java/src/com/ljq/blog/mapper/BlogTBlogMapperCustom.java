package com.ljq.blog.mapper;

import java.util.List;
import java.util.TreeMap;

import com.ljq.blog.po.BlogTBlogCustom;
import com.ljq.blog.po.BlogTBlogVo;

public interface BlogTBlogMapperCustom {
	List<BlogTBlogCustom> selectBlog(BlogTBlogVo blogTBlogVo) throws Exception;

	List<BlogTBlogCustom> selectBlogWithBlogfile(BlogTBlogVo blogTBlogVo) throws Exception;

	BlogTBlogCustom selectBlogWithBlogfileById(String id) throws Exception;

	List<TreeMap<String, Object>> selectBlogCountGroupByClassify() throws Exception;
}