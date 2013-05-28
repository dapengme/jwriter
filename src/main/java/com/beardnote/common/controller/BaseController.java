package com.beardnote.common.controller;

public class BaseController {
    public String r(String redirectUrl) {
        return "redirect:" + redirectUrl;
    }
}
