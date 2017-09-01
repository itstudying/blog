package com.ljq.blog.po;

/**
 * 这个类就用于前端后台的数据传递 Vo
 * 
 * @author Zunqi
 *
 */
public class BlogTManagerVo {
	private BlogTManager blogTManager;

	private BlogTManagerCustom blogTManagerCustom;

	public BlogTManager getBlogTManager() {
		return blogTManager;
	}

	public void setBlogTManager(BlogTManager blogTManager) {
		this.blogTManager = blogTManager;
	}

	public BlogTManagerCustom getBlogTManagerCustom() {
		return blogTManagerCustom;
	}

	public void setBlogTManagerCustom(BlogTManagerCustom blogTManagerCustom) {
		this.blogTManagerCustom = blogTManagerCustom;
	}

}
