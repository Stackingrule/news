package com.mooc.api.controller.user;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;

@Api(value = "controller标题", tags = {"带有xxx功能的api"})
public interface HelloControllerApi {

    /*
    * api作用
     */
    @ApiOperation(value = "hello方法的接口", notes = "hello方法的接口", httpMethod = "GET")
    @GetMapping("/hello")
    public String hello();
}
