package com.ljq.blog.util;

import java.util.Date;

public class Util {
	/**
	 * 根据时间生成唯一的ID
	 * 
	 * @return String
	 */
	public static String getID() {
		return (new Date().getTime() + "").substring(3);
	}
	

}
