package com.app.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("")
public class SessionDemoController {

	@RequestMapping(value="/")
	public ModelAndView app(HttpServletRequest req, HttpServletResponse resp){
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}
	
	
	@RequestMapping(value="/online")
	public ModelAndView getSession(HttpServletRequest req, HttpServletResponse resp){
		ModelAndView mav = new ModelAndView("app/online");
		return mav;
	}
	
	@RequestMapping(value="/login")
	public ModelAndView login(HttpServletRequest req, HttpServletResponse resp){
		ModelAndView mav = new ModelAndView("app/login");
		HttpSession session = req.getSession();
		session.setAttribute("userName", req.getParameter("uName"));
		return mav;
	}
}
