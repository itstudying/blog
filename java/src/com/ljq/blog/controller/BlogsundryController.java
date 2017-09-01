package com.ljq.blog.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ljq.blog.po.BlogTBlogsundryCustom;
import com.ljq.blog.service.BlogsundryService;

@Controller
@RequestMapping("/blogsundry")
public class BlogsundryController {

	@Autowired
	private BlogsundryService blogsundryService;

	@RequestMapping("/updateSubmit")
	public String updateSubmit(Model model, BlogTBlogsundryCustom blogTBlogsundryCustom, HttpServletRequest repuest) {

		int row = blogsundryService.updateByPrimaryKeySelective(blogTBlogsundryCustom);
		if (row == 1) {

		}
		return "forward:/manage/forward/blogseo";

	}

}
