package com.mooc.jiangzh.dubbo.springboot.privoder;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;

@SpringBootApplication
@EnableDubboConfiguration
public class PrivoderApplication {

    public static void main(String[] args) {

        SpringApplication.run(PrivoderApplication.class, args);
        HashMap<String,Object> map=new HashMap<>();
        map.put("name","zhangsan");
        System.out.println(map.get("name"));

    }
}
