package com.yzp.dao;

import com.yzp.domain.User;

/**
 * 这个是卖家的信息
 */
public interface UserDao {
    /**
     * 查找单个信息
     * @return
     */
    public User findUser_bycid();
}
