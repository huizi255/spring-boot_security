package com.huizi.service;

import com.huizi.mybatis.domain.User;

import java.util.List;

/**
 * Created by Administrator on 2018/1/23.
 */
public interface UserService {
    List<User> findUserList();
}
