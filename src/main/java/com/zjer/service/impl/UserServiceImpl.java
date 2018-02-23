package com.zjer.service.impl;

import com.zjer.dao.UserDao;
import com.zjer.entity.User;
import com.zjer.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Administrator
 * @date 2018/2/23 15:06
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public void insert(User user) {
        userDao.insert(user);
    }

    @Override
    public int findByName(User user) {
        return userDao.findByName(user);
    }

    @Override
    public int findByNameAndPass(User user) {
        return userDao.findByNameAndPass(user);
    }
}
