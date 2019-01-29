package cn.conquer.dao;

import org.springframework.security.core.userdetails.User;

public interface UserDao {


    public User findByUsername(String username);

    public void save(User user);

    public void update(User user);

    public User findById(int id);

    public void deleteById(int id);
}
