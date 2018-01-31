package com.huizi.controller;

import com.huizi.mybatis.domain.User;
import com.huizi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2018/1/23.
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getUserList")
    public Object getUsers(){
        List<User> userList = userService.findUserList();
        return userList;
    }
}
