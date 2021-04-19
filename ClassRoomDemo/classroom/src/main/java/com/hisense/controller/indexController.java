package com.hisense.controller;

import com.hisense.entity.User;
import com.hisense.service.IndexService;
import com.hisense.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/index")
public class indexController {
    @Autowired
    IndexService indexService;
    @Autowired
    MenuService menuService;
    @RequestMapping(value="/login")
    @ResponseBody
    public List<User> login(){
        return indexService.queryUserInfo("1");
    }

    @RequestMapping(value="/getMenu")
    @ResponseBody
    public List<Map> getMenu(){
        return menuService.queryMenuInfo("1");
    }
}
