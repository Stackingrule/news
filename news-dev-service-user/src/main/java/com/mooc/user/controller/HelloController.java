package com.mooc.user.controller;

import com.mooc.api.controller.user.HelloControllerApi;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController implements HelloControllerApi {

    public String hello() {
        return "<h1>Hello</h1>";
    }
}
