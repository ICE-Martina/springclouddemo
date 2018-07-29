package com.example.servicefeign.service.controller;

import com.example.servicefeign.service.ICallServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Feign控制器
 */
@RestController
public class FeignCallClientController {
    @Autowired
    ICallServiceClient iCallServiceClient;

    @GetMapping(value = "/service-feign")
    public String CallClient(@RequestParam String name){
        return iCallServiceClient.callClient(name);
    }
}
