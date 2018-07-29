package com.example.serviceribbon.service;

/**
 * 通过之前注入到Ioc容器的restTemplate来消费service-client服务的"/service-client"接口
 * IRibbonService接口
 */
public interface IRibbonService {
    String ribbonService(String name);
}
