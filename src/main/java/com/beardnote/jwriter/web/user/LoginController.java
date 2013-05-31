package com.beardnote.jwriter.web.user;

import javax.servlet.http.HttpServletRequest;

import jodd.util.StringUtil;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.beardnote.common.constants.Constants;
import com.beardnote.common.controller.BaseController;
import com.beardnote.jwriter.model.User;

@Controller
public class LoginController extends BaseController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(HttpServletRequest request, String goto_page) {
        if (StringUtil.isNotBlank(goto_page)) {
            return r("/");
        } else {
            return "login";
        }

    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginForm(HttpServletRequest request) {
        User user = new User();
        user.setUsername("zhaopeng");
        request.getSession().setAttribute(Constants.Front.USER_KEY, user);
        // return "redirect:/app/frontPage/CACHEY,frontPage,1,1";
        return r("/");
    }

}
