package com.ljq.bog.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class CustomHandlerException implements HandlerExceptionResolver {

	@Override
	public ModelAndView resolveException(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2,
			Exception arg3) {
		// TODO Auto-generated method stub
		BlogOptException blogOptException = null;
		if (arg3 instanceof BlogOptException) {
			blogOptException = (BlogOptException) arg3;
		} else {
			blogOptException = new BlogOptException("未知错误");
		}
		String message = blogOptException.getMessage();

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("error");
		modelAndView.addObject("message", message);

		return modelAndView;
	}

}
