package com.ljq.blog.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.ljq.blog.po.BlogTBlogCustom;
import com.ljq.blog.po.BlogTBlogVo;
import com.ljq.blog.service.BlogService;

@Controller
@RequestMapping("/show")
public class ShowController {

	@Autowired
	private BlogService blogService;

	@Value("#{page['page.showsize']}")
	private String showsize;

	@RequestMapping("/forward/{destination}")
	public ModelAndView forward(@PathVariable("destination") String destination) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		System.out.println(destination + "-----");
		if (Pattern.matches("blog\\d{10}", destination)) {
			// 如果参数是博客的id，则跳转到该博客的详情页
			modelAndView.setViewName("show/blogdetail");
			BlogTBlogCustom blogTBlogCustom = blogService.selectBlogWithBlogfileById(destination);
			modelAndView.addObject("blogdetail", blogTBlogCustom);
			modelAndView.addObject("classify", blogTBlogCustom.getClassify());
		} else {
			// 如果参数不是博客的id，则跳转到对应的页面
			modelAndView.setViewName("show/" + destination);
			List<BlogTBlogCustom> blogList = new ArrayList<>();
			if ("openSource-pro".equals(destination)) {

				// 查询出所有开源项目列表，并加入到model中
				BlogTBlogCustom blogCustom = new BlogTBlogCustom();
				blogCustom.setClassify("blogclassify1");
				BlogTBlogVo blogTBlogVo = new BlogTBlogVo();
				blogTBlogVo.setBlogTBlogCustom(blogCustom);
				blogList = blogService.selectBlog("1", showsize, blogTBlogVo);

			} else {
				// 跳转到首页的，
				System.out.println("strShowPageSize: " + showsize);
				blogList = blogService.selectBlog("1", showsize, null);
			}
			modelAndView.addObject("pageInfo", new PageInfo<>(blogList));
		}

		// 如果是需要用到博客分类数量的，则查询出数量，并添加到model中返回
		if (Pattern.matches("blog\\d{10}", destination) || "blogs".equals(destination)) {
			List<TreeMap<String, Object>> blogClassifyCountList = blogService.selectBlogCountGroupByClassify();
			modelAndView.addObject("blogClassifyCountList", blogClassifyCountList);
		}
		return modelAndView;
	}

	@RequestMapping("/classifyForward/{classify}/{pageNum}")
	public String classifyForward(@PathVariable("classify") String classify, @PathVariable String pageNum, Model model)
			throws Exception {

		BlogTBlogCustom blogCustom = new BlogTBlogCustom();
		blogCustom.setClassify(classify);
		BlogTBlogVo blogTBlogVo = new BlogTBlogVo();
		blogTBlogVo.setBlogTBlogCustom(blogCustom);

		// 调用分页的方法，首页查询第一页，每页显示3条数据
		List<BlogTBlogCustom> blogList = blogService.selectBlog(pageNum, showsize, blogTBlogVo);
		// 将查询出的结果进行封装，在页面中显示5页的数据，每页显示3个
		model.addAttribute("pageInfo", new PageInfo<>(blogList));
		model.addAttribute("blogClassifyCountList", blogService.selectBlogCountGroupByClassify());
		if (blogList != null && blogList.size() > 0) {
			model.addAttribute("classify", blogList.get(0).getClassify());
			model.addAttribute("classifyId",
					blogService.selectBlogclassifyIdByClassify(blogList.get(0).getClassify()).getId());
		}

		return "show/blogs";

	}

	@RequestMapping("/pageForward/{destination}/{pageNum}")
	public String pageForward(@PathVariable("destination") String destination, @PathVariable("pageNum") String pageNum,
			Model model) throws Exception {
		// 跳转到首页的，
		// 调用分页的方法，首页查询第一页，每页显示3条数据
		List<BlogTBlogCustom> blogList = blogService.selectBlog(pageNum, showsize, null);
		// 将查询出的结果进行封装，在页面中显示5页的数据，每页显示3个
		model.addAttribute("pageInfo", new PageInfo<>(blogList));

		// 获得博客所有文章得分类
		model.addAttribute("blogClassifyCountList", blogService.selectBlogCountGroupByClassify());
		return "show/blogs";
	}
}
