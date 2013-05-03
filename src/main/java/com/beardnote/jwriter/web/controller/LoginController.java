package com.beardnote.jwriter.web.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.beardnote.jwriter.model.User;
import com.beardnote.jwriter.service.UserService;

@Controller
public class LoginController {
	@Autowired
	private UserService userService;

	@RequestMapping("/")
	public ModelAndView home() {
		User user = new User();
		user.setUsername("zha1111111111111111111111111111111111111111111111openg");
		user.setEmail("aaaa");
		user.setPassword("fdf");
		System.out.println(userService.getUsername());
		userService.save(user);
		return new ModelAndView("index");
	}

}
