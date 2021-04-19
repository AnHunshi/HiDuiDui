package com.hisense.service.impl;

import com.hisense.entity.User;
import com.hisense.mapper.UserMapper;
import com.hisense.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndexServiceImpl implements IndexService {
    @Autowired
    UserMapper UserMapper;
    @Override
    public List<User> queryUserInfo(String id){
        List<User> userlist = UserMapper.queryUserInfo(id);
        return userlist;
    }
}
