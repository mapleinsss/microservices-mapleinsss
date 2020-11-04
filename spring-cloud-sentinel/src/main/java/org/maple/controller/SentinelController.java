package org.maple.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mapleins
 */
@RestController
public class SentinelController {

    @SentinelResource(value = "get",blockHandler = "blockHandlerGet")
    @GetMapping("/get")
    public String get(){
        return "hello world!";
    }

    public String blockHandlerGet(BlockException e){
        return "被限流了";
    }

    @GetMapping("/dash")
    public String dash(){
        return "hello Dash";
    }

    @GetMapping("/findAll/{id}")
    public String findAll(@PathVariable("id") Integer id){
        return "findAll" + id;
    }
}
