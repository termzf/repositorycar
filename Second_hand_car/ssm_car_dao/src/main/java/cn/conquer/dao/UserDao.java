package cn.conquer.dao;

/**
 * 用户模块的dao层接口
 */

import org.springframework.security.core.userdetails.User;

import java.util.List;

public interface UserDao {

    public List<User> findAll();

    public User findByUsername(String username);

    public void save(User user);

    public void update(User user);

    public User findById(int id);

    public void deleteById(int id);
}
