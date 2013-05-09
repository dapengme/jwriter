package com.beardnote.common.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.ServletWebRequest;

import com.beardnote.common.web.var.Flash;
import com.beardnote.common.web.var.FlashImpl;

public class Invocation {

    private transient Flash flash;

    /** 获取HttpServletResponse */
    public static HttpServletResponse getResponse() {
        return ((ServletWebRequest) RequestContextHolder.getRequestAttributes()).getResponse();
    }

    /** 获取HttpServletRequest */
    public static HttpServletRequest getRequest() {
        return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
    }

    /**
     * 返回rose对本次请求的地址、方法的信息
     * <p>
     * 比如你想得到本次调用的 URL，通过 {@link RequestPath#getUri()} 将是最准确的，而非
     * {@link HttpServletRequest#getRequestURI()}。
     * 
     * @return
     */
    /**
     * 用于向重定向跳转后的页面传递参数，比如提示信息
     * 
     * @param name
     * @param msg
     */
    public void addFlash(String name, String msg) {
        getFlash(true).add(name, msg);
    }

    public Flash getFlash() {
        return getFlash(true);
    }

    public Flash getFlash(boolean create) {
        if (this.flash != null) {
            return this.flash;
        }
        Flash flash = (Flash) getRequest().getAttribute("$$paoding-rose.flash");
        if (flash == null && create) {
            flash = new FlashImpl(this);
            getRequest().setAttribute("$$paoding-rose.flash", flash);
        }
        return this.flash = flash;
    }
}
