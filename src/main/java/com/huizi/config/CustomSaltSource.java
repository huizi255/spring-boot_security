package com.huizi.config;

import org.springframework.security.authentication.dao.SaltSource;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * Created by Administrator on 2018/1/31.
 */
public class CustomSaltSource implements SaltSource {
    @Override
    public Object getSalt(UserDetails userDetails) {
        return "abc";
    }
}
