package com.toov5.controller;

import org.springframework.stereotype.Controller;
/*
 * ��תҳ��
 * 
 */
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class UserController {

	@RequestMapping("/pageIndex")
	public String pageIndex(){
		return "pageIndex";
	}
	
}