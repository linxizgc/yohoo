package com.yohoo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by kaikentule on 2019/4/10.
 */
@Controller
@RequestMapping("/")
public class IndexController {
    @RequestMapping("/")
    public String index() {
        return "platform/login";
    }
}
