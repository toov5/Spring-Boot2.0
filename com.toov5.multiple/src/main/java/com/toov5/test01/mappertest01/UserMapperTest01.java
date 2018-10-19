package com.toov5.test01.mappertest01;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface UserMapperTest01 {
	@Insert("insert into users values(null,#{name},#{age});")
	public int insert(@Param("name") String name, @Param("age") Integer age);

}
