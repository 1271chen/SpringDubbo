package com.mooc.jiangzh.dubbo.springboot.consumer.quickstart;

import com.alibaba.dubbo.config.annotation.Reference;
import com.mooc.jiangzh.dubbo.springboot.ServiceAPI;
import org.springframework.stereotype.Component;

@Component
public class QuickstartConsumer {

    @Reference(url="dubbo://127.0.0.1:20880")
    ServiceAPI serviceAPI;

    public void sendMessage(String message){
        System.out.println(serviceAPI.sendMessage(message));
    }

}
