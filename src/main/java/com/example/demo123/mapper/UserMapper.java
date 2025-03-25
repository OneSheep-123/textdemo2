package com.example.demo123.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo123.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
} 