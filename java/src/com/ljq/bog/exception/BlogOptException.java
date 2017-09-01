package com.ljq.bog.exception;

/**
 * 
 * 
 * @project: blog
 * @ClassName: BlogOptException
 * @Description: 操作blog文章时如果报错抛出此异常
 * @author Zunqi
 * @date 2017年9月4日
 * 
 *       <p>
 *       代码搬运工：itstudying.com
 *       <p>
 */
public class BlogOptException extends Exception {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public BlogOptException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
		this.message = message;

	}

}
