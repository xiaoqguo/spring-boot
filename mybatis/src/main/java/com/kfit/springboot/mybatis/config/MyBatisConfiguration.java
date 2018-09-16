package com.kfit.springboot.mybatis.config;

import com.github.pagehelper.PageHelper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.omg.PortableInterceptor.Interceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

//import javax.sql.DataSource;
//import java.util.Properties;
//
//@Configuration
//public class MyBatisConfiguration {
//
//
//    @Bean
//    public PageHelper pageHelper(){
//        System.out.println("MyBatisConfiguration.pageHelper()");
//        PageHelper pageHelper = new PageHelper();
//        Properties p = new Properties();
//        p.setProperty("offsetAsPageNum","true");
//        p.setProperty("rowBoundsWithCount","true");
//        p.setProperty("reasonable","true");
//        pageHelper.setProperties(p);
//        return pageHelper;
//    }
//}
