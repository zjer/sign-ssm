package com.zjer.dao.impl;

import com.zjer.dao.UserDao;
import com.zjer.entity.User;

/**
 * @author Administrator
 * @date 2018/2/23 15:03
 */
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {
    public UserDaoImpl() {
        //设置命名空间
        super.setNs("com.dao.UserDao");
    }

    @Override
    public int findByName(User user) {
        return 0;
    }

    @Override
    public int findByNameAndPass(User user) {
        return 0;
    }
}
