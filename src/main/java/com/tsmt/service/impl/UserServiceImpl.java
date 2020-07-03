package com.tsmt.service.impl;

import com.tsmt.dao.UserDao;
import com.tsmt.domain.User;
import com.tsmt.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void register(User user) {
        userDao.save(user);
    }
}
