package top.byk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * TODO:
 * author:ykb
 * DateTime:2019/5/13 14:24
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
