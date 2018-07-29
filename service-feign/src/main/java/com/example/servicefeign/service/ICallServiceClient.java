package com.example.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 调用其他服务的接口
 * @FeignClient(value = "service-client")指定调用service-client服务
 */
@FeignClient(value = "service-client")
public interface ICallServiceClient {
    @RequestMapping(value = "/service-client",method = RequestMethod.GET)
    String callClient(@RequestParam(value = "name") String name);
}
