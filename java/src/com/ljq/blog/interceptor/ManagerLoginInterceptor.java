package com.ljq.blog.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * 
 * @project: blog
 * @ClassName: ManagerLoginInterceptor
 * @Description: 用于控制管理员登录的拦截器
 * @author Zunqi
 * @date 2017年8月24日
 * 
 *       <p>
 *       代码搬运工：itstudying.com
 *       <p>
 */
public class ManagerLoginInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		// TODO Auto-generated method stub
		String uri = request.getRequestURI();

		if (uri.contains("login")) {
			return true;
		}

		// 如果是去后台管理，则判断是否登录，如果没有登录则跳转到登录页面
		if (uri.contains("manage") || uri.contains("manageblog")) {
			Object manager = request.getSession().getAttribute("manager");
			if (manager == null) {
				request.getRequestDispatcher("/WEB-INF/jsp/login/login.jsp").forward(request, response);
				return false;
			}
		}

		return true;
	}

}
