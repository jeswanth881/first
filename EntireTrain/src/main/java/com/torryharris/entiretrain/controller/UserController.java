package com.torryharris.entiretrain.controller;

import com.torryharris.entiretrain.model.TrainModel;
import com.torryharris.entiretrain.model.User;
import com.torryharris.entiretrain.repository.TrainRepo;
import com.torryharris.entiretrain.repository.UserRepository;
import com.torryharris.entiretrain.service.TrainService;
import com.torryharris.entiretrain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository repo;

    @GetMapping("/login")

    public ModelAndView login() {
        ModelAndView mav = new ModelAndView("login");
        mav.addObject("user", new User());
        return mav;
    }
    @RequestMapping("get")
    public String get(User user){
        repo.save(user);
        return "Login.html";
    }
    @PostMapping("/login")
    public String login(@ModelAttribute("user") User user ) {

        User oauthUser = userService.login(user.getUsername(), user.getPassword());


        System.out.print(oauthUser);
        if(Objects.nonNull(oauthUser))
        {

            return "register.html";


        } else {
            return "redirect:/login";


        }

    }

    @RequestMapping(value = {"/logout"}, method = RequestMethod.POST)
    public String logoutDo(HttpServletRequest request, HttpServletResponse response)
    {


        return "redirect:/login";
    }
    @PostMapping("/ht")
    public String defectDetails() {
        return "ht.html";
    }
}
