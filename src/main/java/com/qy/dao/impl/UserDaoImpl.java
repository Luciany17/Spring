package com.qy.dao.impl;

import com.qy.dao.UserDao;

public class UserDaoImpl implements UserDao {
    public UserDaoImpl() {
        System.out.println("无参构造...");
    }

    public void save() {
        System.out.println("sava running...");
    }
}
