package com.beardnote.jwriter.web.admin;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.beardnote.common.constants.Constants;
import com.beardnote.jwriter.model.User;

@Controller("adminLoginController")
@RequestMapping("/admin")
public class LoginController {
	@RequestMapping(value = "/login.do", method = RequestMethod.GET)
	public String login() {
		return "login";
	}

	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public String loginForm(HttpServletRequest request) {
		User user = new User();
		user.setUsername("zhaopeng");
		request.getSession().setAttribute(Constants.Admin.ADMIN_USER_KEY, user);
		return "redirect:/admin/index.do";
	}
}
