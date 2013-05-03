package com.beardnote.jwriter.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.beardnote.jwriter.model.User;

@Controller
public class LoginController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginForm(HttpServletRequest request) {
		User user = new User();
		user.setUsername("zhaopeng");
		request.getSession().setAttribute("userinfo", user);
//		return "redirect:/app/frontPage/CACHEY,frontPage,1,1";
		return "redirect:/";
	}

}
