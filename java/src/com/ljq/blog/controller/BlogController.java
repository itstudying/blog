package com.ljq.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ljq.blog.po.BlogTBlogCustom;
import com.ljq.blog.po.BlogTBlogVo;
import com.ljq.blog.service.BlogService;
import com.ljq.blog.util.DateUtil;
import com.ljq.bog.exception.BlogOptException;

@Controller
@RequestMapping("/manageblog")
public class BlogController {

	@Autowired
	private BlogService blogService;

	/**
	 * 插入博客信息，
	 * 
	 * @param blogTBlogCustom
	 *            页面传来的数据，参数绑定成的po对象
	 * @throws BlogOptException 
	 */
	@RequestMapping("/pubblog")
	public String pubblog(BlogTBlogVo blogTBlogVo, Model model) throws BlogOptException {

		String pubtime = DateUtil.GetNowDatetime();
		BlogTBlogCustom blogCustom = blogTBlogVo.getBlogTBlogCustom();
		blogCustom.setPubtime(pubtime);
		blogService.insert(blogTBlogVo);
		try {
			model.addAttribute("blogCustom",
					blogService.selectBlogWithBlogfileById(blogCustom.getId()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "manage/addblog";
	}

	/**
	 * 
	 * 在修改博客前，查询出博客的基本信息，返回
	 * 
	 * @param blogId
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/updateQuery/{blogId}")
	public ModelAndView updateQuery(@PathVariable("blogId") String blogId) throws Exception {

		ModelAndView modelAndView = new ModelAndView();
		// 根据博客id查询出博客的数据
		BlogTBlogCustom blogCustom = blogService.selectBlogWithBlogfileById(blogId);
		modelAndView.addObject("blogCustom", blogCustom);
		modelAndView.setViewName("manage/update");

		return modelAndView;
	}

	@RequestMapping("/updateSubmit")
	public ModelAndView updateSubmit(@RequestParam(value = "blogTBlogCustom.id", required = true) String blogId,
			BlogTBlogVo blogTBlogVo) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		int col = blogService.updateByPrimaryKeyWithBLOBs(blogId, blogTBlogVo);
		if (col <= 0) {
			throw new Exception("修改失败 " + col + " 行");
		}
		modelAndView.addObject("blogCustom", blogService.selectBlogWithBlogfileById(blogId));
		modelAndView.setViewName("manage/update");

		return modelAndView;
	}

}
