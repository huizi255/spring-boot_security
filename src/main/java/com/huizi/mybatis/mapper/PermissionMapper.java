package com.huizi.mybatis.mapper;

import com.huizi.mybatis.domain.Permission;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2018/1/31.
 */
@Repository
@Mapper
public interface PermissionMapper {
    List<Permission> findAll();
    List<Permission> findByAdminUserId(int userId);
}
