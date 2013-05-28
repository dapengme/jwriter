package com.beardnote.jwriter.service;

import org.nutz.dao.Cnd;
import org.springframework.stereotype.Service;

import com.beardnote.common.service.BaseService;
import com.beardnote.jwriter.model.AppBlog;

@Service
public class AppBlogService extends BaseService {
    /**
     * 获取最新的一条
     * 
     * @return
     */
    public AppBlog getLastBlog() {
        return dao.fetch(AppBlog.class, Cnd.orderBy().desc("id"));
    }
}
