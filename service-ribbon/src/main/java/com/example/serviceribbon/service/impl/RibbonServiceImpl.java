package com.example.serviceribbon.service.impl;

import com.example.serviceribbon.service.IRibbonService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 接口实现类
 */
@Service
public class RibbonServiceImpl implements IRibbonService {

    @Autowired
    RestTemplate restTemplate;

    /**
     * 用程序名代替了具体的URL
     * @HystrixCommand(fallbackMethod = "clientError")该注解对该方法创建了熔断器的功能，并fallbackMethod指定了熔断方法
     * @param name
     * @return
     */
    @HystrixCommand(fallbackMethod = "clientError")
    @Override
    public String ribbonService(String name) {
        return restTemplate.getForObject("http://SERVICE-CLIENT/service-client?name="+name,String.class);
    }

    /**
     * 熔断方法
     */
    public String clientError(String name){
        return name + ",sorry error!";
    }
}
