package com.ljq.blog.service;

import java.util.List;
import java.util.TreeMap;

import com.github.pagehelper.PageInfo;
import com.ljq.blog.po.BlogTBlog;
import com.ljq.blog.po.BlogTBlogCustom;
import com.ljq.blog.po.BlogTBlogVo;
import com.ljq.blog.po.BlogTBlogclassifyCustom;
import com.ljq.bog.exception.BlogOptException;

public interface BlogService {
	public int insert(BlogTBlogVo record) throws BlogOptException;

	public List<BlogTBlogCustom> selectBlog(String pageNum, String pageSize, BlogTBlogVo blogTBlogVo) throws Exception;

	public PageInfo selectBlogWithBlogfile(String pageNum, String pageSize, BlogTBlogVo blogTBlogVo) throws Exception;

	public BlogTBlogCustom selectBlogWithBlogfileById(String id) throws Exception;

	public List<TreeMap<String, Object>> selectBlogCountGroupByClassify() throws Exception;

	public int updateByPrimaryKeyWithBLOBs(String blogId, BlogTBlogVo blogTBlogVo) throws Exception;

	// 查询博客分类的
	public BlogTBlogclassifyCustom selectBlogclassifyIdByClassify(String classify) throws Exception;
}
