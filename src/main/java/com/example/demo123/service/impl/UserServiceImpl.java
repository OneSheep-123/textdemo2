package com.example.demo123.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo123.entity.User;
import com.example.demo123.mapper.UserMapper;
import com.example.demo123.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
} 