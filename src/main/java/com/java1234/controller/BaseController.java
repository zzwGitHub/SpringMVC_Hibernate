package com.java1234.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java1234.model.User;
import com.java1234.service.IUserService;

@Controller
@RequestMapping(value = "/base")
public class BaseController {

	@Resource
	private IUserService userService;
	
	@RequestMapping(value = "/getSystem")
	public void getSystem(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		System.out.println("1");
		User user = new User();
		user.setSex("nan");
		userService.userAdd(user);
		System.out.println("2");
		
//		response.setContentType("text/html;charset=utf-8");
//		response.setCharacterEncoding("utf-8");
//		response.getWriter().write("ÄãÊÇ×î°ôµÄ£¡");
	}
}
