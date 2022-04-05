package com.dzqc.cloud.service.impl;

import com.dzqc.cloud.dao.UserinfoMapper;
import com.dzqc.cloud.entity.Userinfo;
import com.dzqc.cloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserinfoMapper userinfoMapper;

    @Override
    public Userinfo login(String username, String userpassword){
        return userinfoMapper.login(username, userpassword);
    }

    @Override
    public Userinfo selectByPhone(String phone) {
        return userinfoMapper.selectByPhone(phone);
    }
}
