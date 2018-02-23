package com.zjer.service;

import com.zjer.entity.User;

/**
 * @author Administrator
 * @date 2018/2/23 15:05
 */
public interface UserService {
    //插入，用实体作为参数
    public void insert(User user);

    // 验证用户名是否存在
    public int findByName(User user);

    // 验证用户名和密码是否存在
    public int findByNameAndPass(User user);
}
