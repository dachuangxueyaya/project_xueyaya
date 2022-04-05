package com.dzqc.cloud.dao;

import com.dzqc.cloud.entity.Userinfo;
import org.apache.ibatis.annotations.Param;

public interface UserinfoMapper<Users> {
    int deleteByPrimaryKey(Integer id);

    int insert(Userinfo record);

    int insertSelective(Userinfo record);

    Userinfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Userinfo record);

    int updateByPrimaryKey(Userinfo record);


    public Userinfo login(@Param("username") String username, @Param("userpassword") String userpassword);

    /**
     * 根据手机号查询用户
     * @param phone
     * @return
     */
    Userinfo selectByPhone(String phone);
}