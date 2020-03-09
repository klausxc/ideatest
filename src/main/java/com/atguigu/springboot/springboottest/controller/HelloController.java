package com.atguigu.springboot.springboottest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.util.HashMap;

@RestController
public class HelloController {
    @Autowired
    DataSource dataSource;

    @RequestMapping("/hello")
    public  String test(String user){
        System.out.println("user = [" + user + "]");
        HashMap<Object, Object> map = new HashMap<>();
        
        System.out.println("dataSource = " + dataSource);

        System.out.println(123);
        return  "hello";
    }
}
