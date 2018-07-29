package com.example.serviceribbon.service.impl;

import com.example.serviceribbon.service.IRibbonService;
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
     * @param name
     * @return
     */
    @Override
    public String ribbonService(String name) {
        return restTemplate.getForObject("http://SERVICE-CLIENT/service-client?name="+name,String.class);
    }
}
