package com.ljq.blog.service;

import java.util.List;

import com.ljq.blog.po.BlogTManager;
import com.ljq.blog.po.BlogTManagerCustom;
import com.ljq.blog.po.BlogTManagerVo;

/**
 * 
 * 提现多态
 * 
 * @author Zunqi
 *
 */
public interface ManagerService {
	BlogTManager selectByPrimaryKey(String no) throws Exception;

	List<BlogTManagerCustom> selectManager(BlogTManagerVo blogTManagerVo) throws Exception;
}
