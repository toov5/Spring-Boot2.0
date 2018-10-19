package com.toov5.test02.service02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.toov5.test02.mappertest02.UserMapperTest02;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService02 {
  @Autowired
  private UserMapperTest02 userMapperTest02;
  
  @Transactional(transactionManager="test2TransactionManager")
  public int insertUser(String name, Integer age){
	 int result = userMapperTest02.insert(name, age);
      log.info("####################",result);
	  return result;
  }
}