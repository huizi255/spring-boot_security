package com.huizi.service.impl;

import com.huizi.mybatis.domain.User;
import com.huizi.mybatis.mapper.UserMapper;
import com.huizi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/1/23.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findUserList() {
        return userMapper.findUserList();
    }
}
