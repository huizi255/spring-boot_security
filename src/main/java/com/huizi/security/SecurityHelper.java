package com.huizi.security;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created by Administrator on 2018/1/31.
 */
public class SecurityHelper {
    private static BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public static String encryptPassword(String username, String presentedPassword) {
        return passwordEncoder.encode(username + presentedPassword);
    }

    public static boolean checkPwd(String rawPassword,String encodedPassword){
        return passwordEncoder.matches(rawPassword, encodedPassword);
    }
}
