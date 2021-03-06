package com.toov5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.toov5.test01.service01.UserService01;
import com.toov5.test02.service02.UserService02;

@RestController
public class MultiplyController {
    @Autowired
    private UserService01 userService01;
	
    @Autowired
    private UserService02 userService02;
    
	@RequestMapping("/insertUser01")
	public Integer insertUser1(String name, Integer age){
		int i = 1/age;
		return userService01.insertUser(name, age);
	}
	
	@RequestMapping("/insertUser02")
	public Integer insertUser2(String name, Integer age){
		return userService02.insertUser(name, age);
	}
	
}
