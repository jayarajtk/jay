package com.springbootkid.trails.starter.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jt316g on 10/7/2017.
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/")
    public String sayHelloWorld() {
        return "Hello World!";
    }
}
