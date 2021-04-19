package com.hisense.service;

import com.hisense.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IndexService {
    List<User> queryUserInfo(String id);
}
