package com.dzqc.cloud.service;

import com.dzqc.cloud.entity.Userinfo;
public interface UserService {
    public Userinfo selectByPhone(String phone);
    // 登录
    public Userinfo login(String username, String userpassword);
}
