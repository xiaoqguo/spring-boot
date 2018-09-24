package com.kfit.springboot.mybatis.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class DemoService {

    @Autowired
    private DemoMapper demoMapper;

    public List<Demo> likeName(String name){
        return demoMapper.likeName(name);
    }

    public Demo save(Demo demo){
        demo.setCreateDate(new Date());
        demoMapper.save(demo);
        return demoMapper.getById(demo.getId());
    }

    public Demo update(Demo demo){
        System.out.println("update demo in service");
        demoMapper.update(demo);
        return demoMapper.getById(demo.getId());
    }

    public int delete(int id){
        return demoMapper.delete(id);
    }

    public List<Demo> selectAll(String orderField,String orderType){
        String ascDesc = "desc";
        if(orderType !=null && !orderType.equals("")){
            ascDesc = orderType;
        }
        String field = "createDate";
        if (orderField != null && !orderField.equals("")) {
            field = orderField;
        }
        System.out.println(field);
        System.out.println(ascDesc);
        return demoMapper.selectAll(field,ascDesc);
    }

    public Demo selectById(int id){
        return demoMapper.getById(id);
    }

    public List<Demo> scriptQuery(Demo demo){
        return demoMapper.scriptQuery(demo);
    }
}
