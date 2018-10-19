package com.toov5.jsp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class valueTest {
	 @Value("${name}")
	 private String name;
	@RequestMapping("/getName")
	public String getName(){
		return name;
	}
	
	
	@Value("${http_url}")
	private String HttpUrl;
	@RequestMapping("/getUrl")
	public String getUrl(){
		return  HttpUrl;
	}
	
	
	
	
}
