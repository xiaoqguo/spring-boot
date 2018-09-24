package com.kfit.springboot.mybatis.demo;

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/demo")
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

    @RequestMapping(path="/update",method = RequestMethod.PUT)
    public Demo updateDemo(Demo demo){
        System.out.println("update demo in controller");
        return demoService.update(demo);
    }

    @RequestMapping(path="/delete",method = RequestMethod.DELETE)
    public int deleteDemo(int id){
        return demoService.delete(id);
    }

    @RequestMapping(path="/selectAll",method = RequestMethod.GET)
    public List<Demo> selectAll(Integer page,Integer size,String orderField,String orderType){
        int p=1;
        int s=20;
        if(page!=null){
            p=page;
        }
        if(size!=null){
            s=size;
        }
        PageHelper.startPage(p,s);
        return demoService.selectAll(orderField,orderType);
    }

    @RequestMapping(path="/selectById",method = RequestMethod.GET)
    public Demo selectById(int id){
        return demoService.selectById(id);
    }

    @RequestMapping(path="/scriptQuery",method = RequestMethod.GET)
    public List<Demo> query1(Demo demo){
        return demoService.scriptQuery(demo);
    }
}
