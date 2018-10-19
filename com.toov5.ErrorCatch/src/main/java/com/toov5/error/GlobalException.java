package com.toov5.error;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice(basePackages="com.toov5.ErrorCatch")  //SpringBoot���쳣����㡣�˰��µİ����˹�
public class GlobalException {
   @ExceptionHandler(RuntimeException.class)
   @ResponseBody  //����jsoon���ͻ���
   public Map<String, Object> errorResult(){
	   Map<String, Object> map = new HashMap<String, Object>();
	   map.put("errorCode", "666");
	   map.put("errorMsg", "AOPȫ�ֲ����쳣��������˼��");
	   return map;
	   
   }
	
	
}