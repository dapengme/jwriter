/*
 * 
 * Wordpress-java
 * http://code.google.com/p/wordpress-java/
 * 
 * Copyright 2012 Can Bican <can@bican.net>
 * See the file 'COPYING' in the distribution for licensing terms.
 * 
 */
package net.bican.wordpress.example;

import java.net.MalformedURLException;

import net.bican.wordpress.Page;
import net.bican.wordpress.Wordpress;
import redstone.xmlrpc.XmlRpcFault;

/**
 * 
 * Example implementation
 * 
 * Run this as java net.bican.wordpress.example.Main &lt;username&gt;
 * &lt;password&gt; &lt;xmlrpc-url&gt; for your blog.
 * 
 * @author Can Bican
 * 
 */
public class Main {

    /**
     * @param args
     * @throws MalformedURLException
     * @throws XmlRpcFault
     */
    @SuppressWarnings("nls")
    public static void main(String[] args) throws MalformedURLException, XmlRpcFault {
        // newPage();
        getPage(739);
        // String username = "zhaopeng";
        // String password = "123456as";
        // String xmlRpcUrl = "http://localhost:801/wordpress/xmlrpc.php";
        // Wordpress wp = new Wordpress(username, password, xmlRpcUrl);
        // List<Page> recentPosts = wp.getRecentPosts(10);
        // System.out.println("Here are the ten recent posts:");
        // for (Page page : recentPosts) {
        // System.out.println(page.getPostid() + ":" + page.getTitle());
        // }
        // List<PageDefinition> pages = wp.getPageList();
        // System.out.println("Here are the pages:");
        // for (PageDefinition pageDefinition : pages) {
        // System.out.println(pageDefinition.getPage_title());
        // }
        // System.out.println("Posting a test (draft) page from a previous page...");
        // Page recentPost = wp.getRecentPosts(1).get(0);
        //
        // recentPost.setTitle("Test Page");
        // recentPost.setDescription("Test description");
        // String result = wp.newPost(recentPost, false);
        // System.out.println("new post page id: " + result);
        // System.out.println("\nThat's all for now.");
    }

    public static void newPage() throws MalformedURLException, XmlRpcFault {
        String username = "zhaopeng";
        String password = "123456as";
        String xmlRpcUrl = "http://localhost:801/wordpress/xmlrpc.php";
        Wordpress wp = new Wordpress(username, password, xmlRpcUrl);
        Page page = new Page();
        page.setTitle("test111");
        page.setDescription("t22222222222222222222!");
        System.out.println(wp.editPost(739, page, "draft"));
    }

    public static void getPage(int postid) throws MalformedURLException, XmlRpcFault {
        String username = "zhaopeng";
        String password = "123456as";
        String xmlRpcUrl = "http://localhost:801/wordpress/xmlrpc.php";
        Wordpress wp = new Wordpress(username, password, xmlRpcUrl);
        Page page = wp.getPost(postid);
        System.out.println(page.getPost_status());
        System.out.println(wp.editPost(739, page, "draft"));
    }
}
