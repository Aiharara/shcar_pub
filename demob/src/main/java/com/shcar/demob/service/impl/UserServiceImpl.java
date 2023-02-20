package com.shcar.demob.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.shcar.demob.mapper.UserMapper;
import com.shcar.demob.pojo.User;
import com.shcar.demob.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public void register(User user) {
        userMapper.insert(user);
    }

    @Override
    public User login(String email, String password) {
        User user = userMapper.selectOne(new QueryWrapper<User>()
                .eq("email", email)
                .eq("password", password));
        return user;
    }

    @Override
    public List<User> getAll() {
        return userMapper.selectList(null);
    }
}
