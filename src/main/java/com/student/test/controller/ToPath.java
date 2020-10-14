package com.student.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ：Super张
 * @date ：Created in 2020/9/30 15:08
 * @description：
 * @modified By：
 * @version:
 */
@Controller
public class ToPath {

    @RequestMapping("student.html")
    public String student(){
        return "student";
    }
}
