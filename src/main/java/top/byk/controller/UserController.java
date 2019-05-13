package top.byk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import top.byk.entity.User;
import top.byk.service.UserService;

import javax.annotation.Resource;
import java.util.List;

/**
 * TODO:
 * author:ykb
 * DateTime:2019/5/13 14:32
 */
@Controller
@RequestMapping("/user")
public class UserController {


    @Resource
    private UserService userService;



    @RequestMapping(value = "toUser",method = RequestMethod.GET)
    public String toUser(){
        return "user";
    }

    @RequestMapping(value = "model",method = RequestMethod.GET)
    public String model(Model model){
        List<User> userList =  userService.getAll();
        model.addAttribute("user","劉德華");
        model.addAttribute("user1",userList.get(1));
        return "user";
    }


    @RequestMapping(value = "modelAndView",method = RequestMethod.GET)
    public ModelAndView modelAndView(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user");
        List<User> userList = userService.getAll();
        modelAndView.addObject("userList",userList);
        return modelAndView;
    }
}
