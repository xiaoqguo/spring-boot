package com.kfit.springboothello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//SpringBootApplication 指定这是一个Spring 程序
@SpringBootApplication
public class SpringBootHelloApplication {

    public static void main(String[] args) {
        //启动应用程序
        SpringApplication.run(SpringBootHelloApplication.class, args);
    }
}
