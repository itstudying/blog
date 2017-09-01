package com.ljq.mybatis;

public class User {
	private static final User user = new User();

	private User() {
		// TODO Auto-generated constructor stub

	}

	public static final User getInstance() {
		return user;
	}
}
