package org.cs.blog.controller;

import org.apache.ibatis.annotations.Param;
import org.cs.blog.service.BlogServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Copyright © 2018 pagoda Inc.
 * Description:
 *
 * @author wangjunjun
 * @date 2018/12/4
 */
@Controller
@RequestMapping("/blogController")
public class BlogController {

    @Autowired
    private BlogServer blogServer;

    @GetMapping("/getBlogName")
    public String getBlogName(@Param("id") String id){
       return blogServer.getBlogName(id);
    }

    @GetMapping("/")
    public String hello(){
        return "HELLO WORLD";
    }

}
