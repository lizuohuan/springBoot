package com.lzh.springBoot.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * @author lzh
 * @create 2017/3/27 11:07
 */

@RestController
@RequestMapping("/home")
public class TestController {
    @Autowired
    @Qualifier("primaryJdbcTemplate")
    JdbcTemplate jdbcTemplate1;

    @Autowired
    @Qualifier("secondaryJdbcTemplate")
    JdbcTemplate jdbcTemplate2;

    @RequestMapping("/test1")
    public Map<String,Object> test1(){
        List<Map<String,Object>> list = jdbcTemplate1.queryForList("select * from users");
        Map<String,Object> maps = new HashMap<>();
        List<String> names = new ArrayList<>();
        List<String> phones = new ArrayList<>();
        List<String> balances = new ArrayList<>();

        for (Map<String, Object> map : list) {
            names.add(map.get("user_name").toString());
            phones.add(map.get("phone_number").toString());
            balances.add(map.get("balance").toString());
            jdbcTemplate1.update("INSERT INTO `users` (`phone_number`,`user_name`,`balance`) VALUES ()");
        }
        maps.put("names",names);
        maps.put("phones",phones);
        maps.put("balances",balances);
        return maps;
    }

    @RequestMapping("/test2")
    public Map test2(){
        List<Map<String,Object>> list = jdbcTemplate2.queryForList("SELECT * from Q_Users");
        List<String> names = new ArrayList<>();
        List<String> phones = new ArrayList<>();
        List<String> balances = new ArrayList<>();
        Map<String,Object> maps = new HashMap<>();
        for (Map<String, Object> map : list) {
            String name = null;
            String phone = null;
            String balance = null;
            if (null != map.get("UserName")) {
                name = map.get("UserName").toString();
            }
            if (null != map.get("UserPhone")) {
                phone = map.get("UserPhone").toString();
            }
            if (null != map.get("Balance")) {
                balance = map.get("Balance").toString();
            }
            names.add(name);
            phones.add(phone);
            balances.add(balance);
            jdbcTemplate1.update("INSERT INTO `users` (`phone_number`,`user_name`,`balance`) " +
                    "VALUES ('"+phone+"','"+name+"'," +
                    "'"+balance+"')");
        }
        maps.put("names",names);
        maps.put("phones",phones);
        maps.put("balances",balances);
        return maps;
    }
}