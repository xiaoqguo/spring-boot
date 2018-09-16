package com.kfit.springboot.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("/likeName")
    public List<Demo> likeName(String name){
        return demoService.likeName(name);
    }

    @RequestMapping(path="/save",method = RequestMethod.POST)
    public Demo addDemo(Demo demo){
        return demoService.save(demo);
    }

    @RequestMapping("/date")
    public Date getDate(){
        return new Date();
    }
}
