package com.example.serviceribbon.controller;

import com.example.serviceribbon.service.IRibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Ribbon控制器
 */
@RestController
public class RibbonController {
    @Autowired
    IRibbonService iRibbonService;

    @GetMapping(value = "/service-ribbon")
    public String serviceribbon(@RequestParam String name){
        return iRibbonService.ribbonService(name);
    }

}
