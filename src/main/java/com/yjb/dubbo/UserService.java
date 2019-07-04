package com.yjb.dubbo;

import com.yjb.dubbo.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User findById(int id);

    int insert(User user);

    int update(User user);

    int delete(int id);
}
