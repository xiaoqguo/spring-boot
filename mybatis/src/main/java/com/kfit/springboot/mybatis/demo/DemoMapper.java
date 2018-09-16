package com.kfit.springboot.mybatis.demo;

import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public interface DemoMapper {

    @Select("select * from test2 where name=#{name}")
    public List<Demo> likeName(String name);

    @Select("select * from test2 where id=#{id}")
    public Demo getById(long id);

    @Select("select name from test2 where id=#{id}")
    public String getNameById(long id);

    @Select("select * from test2 order by ${orderField} ${ascOrDesc}")
    @Results({
        @Result(property="testName",column="test_name")
    })
    public List<Demo> selectAll(@Param("orderField")String orderField,@Param("ascOrDesc")String ascOrDesc);

    @Insert("insert into test2(name,createDate) values(#{name},#{createDate}) ")
    @Options(useGeneratedKeys=true,keyProperty = "id",keyColumn = "id")
    public int save(Demo demo);

    @Update("update test2 set name=#{name} where id=#{id}")
    public int update(Demo demo);

    @Delete("delete from test2 where id=#{id}")
    public int delete(int id);


}
