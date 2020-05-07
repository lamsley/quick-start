package com.lamsley.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    private final Logger logger = LoggerFactory.getLogger(HelloController.class);
    @RequestMapping("/index")
    public Object sayHello() {
        logger.info("这是个hello的日志");
        return "hello4";
    }
}

