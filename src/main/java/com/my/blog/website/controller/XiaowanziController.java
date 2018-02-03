package com.my.blog.website.controller;

import com.my.blog.website.service.ILogService;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @Autowired
    private ILogService logService;

    @GetMapping(value = {"xwz","xwz.html"})
    public String xiaowanzi(){
        return this.render("xiaowanzi");
    }

    @RequestMapping(value = "xiaowanziOk")
    @ResponseBody
    public void xiaowanziOk(HttpServletRequest request){
        logService.insertLog("haha","ok",request.getRemoteAddr(),null);
        System.out.println("is ok");
    }
}