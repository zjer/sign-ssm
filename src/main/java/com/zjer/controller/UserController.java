package com.zjer.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zjer.entity.User;
import com.zjer.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.HashMap;

/**
 * @author Administrator
 * @date 2018/2/23 15:10
 */
@Controller
public class UserController {
    @Resource
    private UserService userService;

    //新增用户信息
    @RequestMapping(value = "/list/user/insert.do",
            produces = "text/json;charset=UTF-8",
            method= RequestMethod.POST)
    @ResponseBody
    public void insert(@RequestBody User user){
        userService.insert(user);
    }

    // 判断用户名是否存在
    @RequestMapping(value = "/list/user/findByName.do",
            produces = "text/json;charset=UTF-8",
            method= RequestMethod.POST)
    @ResponseBody
    public String findByName(@RequestBody User user){
        int count = userService.findByName(user);
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("num",count);
        ObjectMapper mapper = new ObjectMapper();
        String json = null;
        try {
            json = mapper.writeValueAsString(map);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(json);
        return json;		//返回json
    }

    // 判断用户名和密码是否存在
    @RequestMapping(value = "/list/user/getByNameAndPass.do",
            produces = "text/json;charset=UTF-8",
            method= RequestMethod.POST)
    @ResponseBody
    public String getByNameAndPass(@RequestBody User user){
        int count = userService.findByNameAndPass(user);
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("num",count);
        ObjectMapper mapper = new ObjectMapper();
        String json = null;
        try {
            json = mapper.writeValueAsString(map);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(json);
        //返回json
        return json;
    }
}
