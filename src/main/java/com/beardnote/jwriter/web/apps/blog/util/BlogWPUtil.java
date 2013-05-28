package com.beardnote.jwriter.web.apps.blog.util;

import java.net.MalformedURLException;

import net.bican.wordpress.Page;
import net.bican.wordpress.Wordpress;
import redstone.xmlrpc.XmlRpcFault;

import com.beardnote.jwriter.model.AppBlog;
import com.beardnote.jwriter.model.AppBlogPost;

public class BlogWPUtil {
    /**
     * 发布文章
     * 
     * @param blog
     * @param page
     * @param publish
     * @return
     * @throws MalformedURLException
     * @throws XmlRpcFault
     */
    public static String newPost(AppBlog blog, AppBlogPost post, boolean publish) throws MalformedURLException,
            XmlRpcFault {
        Wordpress wp = getWP(blog);
        Page page = new Page();
        page.setTitle(post.getTitle());
        page.setDescription(post.getDescription());
        return wp.newPost(page, true);
    }

    private static Wordpress getWP(AppBlog blog) throws MalformedURLException {
        return new Wordpress(blog.getUsername(), blog.getPassword(), blog.getUrl());
    }
}
