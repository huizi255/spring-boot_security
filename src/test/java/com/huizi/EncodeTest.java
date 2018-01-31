package com.huizi;

import com.huizi.security.SecurityHelper;

/**
 * Created by Administrator on 2018/1/31.
 */
public class EncodeTest {
    public static void main(String[] args) {String s = SecurityHelper.encryptPassword("abel", "abel");
        /*String s = SecurityHelper.encryptPassword("abel", "abel");
        System.out.println(s);*/
        String c = SecurityHelper.encryptPassword("admin", "admin");
        System.out.println(c);
    }
}
