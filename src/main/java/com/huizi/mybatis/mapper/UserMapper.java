package com.huizi.mybatis.mapper;

import com.huizi.mybatis.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2018/1/23.
 */
@Mapper
@Repository
public interface UserMapper {
    List<User> findUserList();

    User findUserByName(String name);
}
