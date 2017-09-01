package com.ljq.blog.service;

import com.ljq.blog.po.BlogTBlog;
import com.ljq.blog.po.BlogTBlogfile;
import com.ljq.blog.po.BlogTBlogfileCustom;

public interface BlogfileService {
	int insert(BlogTBlogfile blogTBlogfile);

	BlogTBlogfileCustom selectFirstFileByBlogId(BlogTBlog blog);
}
