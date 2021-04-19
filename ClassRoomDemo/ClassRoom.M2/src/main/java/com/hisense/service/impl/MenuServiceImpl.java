package com.hisense.service.impl;

import com.hisense.mapper.MenuMapper;
import com.hisense.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    MenuMapper menuMapper;
    @Override
    public List<Map> queryMenuInfo(String id){
        List<Map> menulist = menuMapper.queryMenuInfo(id);
        return menulist;
    }
}
