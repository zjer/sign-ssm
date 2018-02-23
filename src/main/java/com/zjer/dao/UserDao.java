package com.zjer.dao;

import com.zjer.entity.User;

/**
 * @author Administrator
 * @date 2018/2/23 14:50
 */
public interface UserDao extends BaseDao<User> {
    //  判断用户名是否存在
    public int findByName(User user);

    //  验证登陆用户名和密码
    public int findByNameAndPass(User user);
}
