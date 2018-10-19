package com.toov5.ErrorCatch;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;



@RestController //以后经常做微服务异常捕获，要经常用到这个注解
@Slf4j
public class ErrorCatch {
    
    @RequestMapping("/getUser")
	public String getUser(int i ){
        int j = 1/i;	
        log.info("成功哈");
    	return "返回"+j;
	}
    @RequestMapping("/getMember")
    public String getMember(String name, Integer age){
//    	log.info("name"+name+",age"+age );//如果几万个方法都要写这个么？ 所以用aop去统一处理
    	return "okokok";
    }
    
    
}
