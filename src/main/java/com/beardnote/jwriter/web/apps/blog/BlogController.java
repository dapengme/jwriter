package com.beardnote.jwriter.web.apps.blog;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.beardnote.common.controller.BaseController;
import com.beardnote.jwriter.model.AppBlog;
import com.beardnote.jwriter.model.AppBlogPost;
import com.beardnote.jwriter.service.AppBlogPostService;
import com.beardnote.jwriter.service.AppBlogService;
import com.beardnote.jwriter.web.apps.blog.util.BlogWPUtil;

@Controller
@RequestMapping("/apps/blog")
public class BlogController extends BaseController {

    @Autowired
    private AppBlogPostService appBlogPostService;
    @Autowired
    private AppBlogService appBlogService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "/apps/blog/index";
    }

    @RequestMapping(value = "/post", method = RequestMethod.GET)
    public String post() {
        return "/apps/blog/post";
    }

    @RequestMapping(value = "/post", method = RequestMethod.POST)
    @ResponseBody
    public String postForm(HttpServletRequest request, AppBlogPost post) {
        try {
            AppBlog blog = appBlogService.getLastBlog();
            String postId = BlogWPUtil.newPost(blog, post, false);
            System.out.println(postId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "{result:0}";
    }
}
