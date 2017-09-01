package com.ljq.blog.controller;

import java.util.List;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.ljq.blog.po.BlogTBlogCustom;
import com.ljq.blog.po.BlogTManagerCustom;
import com.ljq.blog.po.BlogTManagerVo;
import com.ljq.blog.service.BlogService;
import com.ljq.blog.service.ManagerService;
import com.ljq.blog.util.Util;

@Controller
@RequestMapping("/manage")
public class ManagerController {

	@Autowired
	private ManagerService managerService;

	@Autowired
	private BlogService blogService;

	@Value("#{page['page.managesize']}")
	private String pageManagesize;

	@RequestMapping("/login")
	public String login(HttpSession session, BlogTManagerVo blogTManagerVo, Model model) throws Exception {

		List<BlogTManagerCustom> blogTManagerCustoms = managerService.selectManager(blogTManagerVo);
		if (blogTManagerCustoms.size() == 1) {
			model.addAttribute("manager", blogTManagerCustoms.get(0));
			session.setAttribute("manager", blogTManagerCustoms.get(0));
			return "manage/index";
		}
		model.addAttribute("blogTManagerCustom", blogTManagerVo.getBlogTManagerCustom());
		return "login/login";
	}

	// destination：目的地
	@RequestMapping("/forward/{destination}")
	public ModelAndView forward(@PathVariable("destination") String destination, Model model,
			HttpServletRequest request, HttpServletResponse respose) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		if ("addblog".equals(destination)) {
			String blogId = "blog" + Util.getID();
			BlogTBlogCustom blogCustom = new BlogTBlogCustom();
			blogCustom.setId(blogId);
			modelAndView.addObject("blogCustom", blogCustom);
			Cookie cookie = new Cookie("blogId", blogId);
			cookie.setMaxAge(-1);
			cookie.setPath("/blog");
			respose.addCookie(cookie);
		} else if ("showall".equals(destination)) {
			//去总览页面
			List<BlogTBlogCustom> blogList = blogService.selectBlog("1", pageManagesize, null);
			modelAndView.addObject("pageInfo", new PageInfo<>(blogList));
		} else if ("blogseo".equals(destination)) {
			//去优化博客文章seo 的页面，mybatis配置文件中使用了按需加载，在需要使用blogsundry表数据时则从数据库 加载
			List<BlogTBlogCustom> blogList = blogService.selectBlog("1", pageManagesize, null);
			modelAndView.addObject("pageInfo", new PageInfo<>(blogList));
		}
		// 也可通过 return "forward:逻辑视图名"，进行转发
		modelAndView.setViewName("manage/" + destination);
		return modelAndView;
	}

	@RequestMapping("/pageForward/{destination}/{pageNum}")
	public String pageForward(@PathVariable("destination") String destination, @PathVariable("pageNum") String pageNum,
			Model model) throws Exception {

		List<BlogTBlogCustom> blogList = blogService.selectBlog(pageNum, pageManagesize, null);
		model.addAttribute("pageInfo", new PageInfo<>(blogList));
		return "manage/" + destination;
	}

}
