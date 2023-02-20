package com.shcar.demob.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shcar.demob.pojo.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserMapper extends BaseMapper<User> {

    List<User> findAll();
}
