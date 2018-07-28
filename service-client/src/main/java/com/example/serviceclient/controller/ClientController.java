package com.example.serviceclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *client 控制器
 */
@RestController
public class ClientController {
    @Value("${server.port}")
    private String port;

    @RequestMapping("service-client")
    public String serviceclient(@RequestParam(value = "name" , defaultValue = "linjie") String name){
        return name + port;
    }
}
