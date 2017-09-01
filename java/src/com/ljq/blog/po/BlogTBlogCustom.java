package com.ljq.blog.po;

import java.util.List;

public class BlogTBlogCustom extends BlogTBlog {
	private BlogTBlogsundry blogsundry;

	private List<BlogTBlogfileCustom> blogfileCustoms;

	public BlogTBlogsundry getBlogsundry() {
		return blogsundry;
	}

	public void setBlogsundry(BlogTBlogsundry blogsundry) {
		this.blogsundry = blogsundry;
	}

	public List<BlogTBlogfileCustom> getBlogfileCustoms() {
		return blogfileCustoms;
	}

	public void setBlogfileCustoms(List<BlogTBlogfileCustom> blogfileCustoms) {
		this.blogfileCustoms = blogfileCustoms;
	}

}
