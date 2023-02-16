package com.vn.blog.blogservice.controller;

import com.vn.blog.blogservice.dto.User;
import com.vn.blog.blogservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/findById/{id}")
    public User findById(@PathVariable("id") Long id){
        return userService.findUserById(id);
    }
}
