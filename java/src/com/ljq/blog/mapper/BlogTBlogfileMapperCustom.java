package com.ljq.blog.mapper;

import java.util.List;

import com.ljq.blog.po.BlogTBlog;
import com.ljq.blog.po.BlogTBlogVo;
import com.ljq.blog.po.BlogTBlogfileCustom;

public interface BlogTBlogfileMapperCustom {
	List<BlogTBlogfileCustom> selectByBlogId(BlogTBlogVo blogTBlogVo);

	BlogTBlogfileCustom selectFirstFileByBlogId(BlogTBlog blog);
}