package org.maple.controller;

import org.maple.action.CloudConsumerAction;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author mapleins
 */
@RestController
public class CloudConsumerController {

    @Resource
    private CloudConsumerAction consumerAction;

    @GetMapping("sayHello")
    public String sayHello(@RequestParam String name) {
        return consumerAction.sayHello(name);
    }
}
