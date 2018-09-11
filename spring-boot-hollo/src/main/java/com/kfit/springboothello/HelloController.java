package com.kfit.springboothello;
import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//@RestController 等价于 @Controller+@ResponseBody
@RestController
public class HelloController {

    //使用RequestMapping 建立请求映射
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    //Spring Boot 默认使用 jackson 来解析json
    //jackson 会把对象解析为json字符串
    @RequestMapping("/getDemo")
    public Demo getDemo(){
        Demo demo = new Demo();
        demo.setId(1);
        demo.setName("Guo");
        demo.setCreateDate(new Date());
        return demo;

    }
}
