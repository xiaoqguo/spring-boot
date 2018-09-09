package com.kfit.springboothello;

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
}
