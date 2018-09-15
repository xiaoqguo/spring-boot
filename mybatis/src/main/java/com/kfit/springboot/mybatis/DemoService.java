package com.kfit.springboot.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoService {

    @Autowired
    private DemoMapper demoMapper;

    public List<Demo> likeName(String name){
        return demoMapper.likeName(name);
    }

    public void save(Demo demo){
        Demo nd = demoMapper.save(demo);
        System.out.println(nd);

    }
}
