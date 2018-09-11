package com.kfit.springboothello;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;

//SpringBootApplication 指定这是一个Spring 程序
@SpringBootApplication
public class SpringBootHelloApplication {

    public static void main(String[] args) {
        //启动应用程序
        SpringApplication.run(SpringBootHelloApplication.class, args);
    }
    //使用@Bean进行注入fastJsonHttpMessageConvert
    @Bean
    public HttpMessageConverters fastJsonHttpMessageConverters(){
        //定义一个 信息转换对象
       FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
       //配置对象
       FastJsonConfig fastJsonConfig = new FastJsonConfig();
       fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
       //设置配置信息
       fastConverter.setFastJsonConfig(fastJsonConfig);

        HttpMessageConverter<?> converter = fastConverter;
        return new HttpMessageConverters(converter);
    }
}
