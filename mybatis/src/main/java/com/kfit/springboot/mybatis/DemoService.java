package com.kfit.springboot.mybatis;

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
        demoMapper.save(demo);
        return demoMapper.getById(demo.getId());

    }
}
