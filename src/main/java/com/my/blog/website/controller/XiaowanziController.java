package com.my.blog.website.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 类名称: XiaowanziController
 * 功能描述:
 * 日期:  2018/2/3 11:23
 *
 * @author: renpengfei
 * @since: JDK1.8
 */
@Controller
public class XiaowanziController extends BaseController{

    @GetMapping(value = {"xiaowanzi","xiaowanzi.html"})
    public String xiaowanzi(){
        return this.render("xiaowanzi");
    }
}