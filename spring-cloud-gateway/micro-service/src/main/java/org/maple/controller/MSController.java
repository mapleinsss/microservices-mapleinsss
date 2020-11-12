package org.maple.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mapleins
 */
@RestController
public class MSController {

    @GetMapping("/say")
    public String say(){
        return "hello 小子!";
    }
}
