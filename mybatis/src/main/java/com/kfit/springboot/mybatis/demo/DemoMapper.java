package com.kfit.springboot.mybatis.demo;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DemoMapper {

    @Select("select * from test2 where name=#{name}")
    public List<Demo> likeName(String name);

    @Select("select * from test2 where id=#{id}")
    public Demo getById(long id);

    @Select("select name from test2 where id=#{id}")
    public String getNameById(long id);

    @Insert("insert into test2(name,createDate) values(#{name},#{createDate}) ")
    @Options(useGeneratedKeys=true,keyProperty = "id",keyColumn = "id")
    public void save(Demo demo);
}
