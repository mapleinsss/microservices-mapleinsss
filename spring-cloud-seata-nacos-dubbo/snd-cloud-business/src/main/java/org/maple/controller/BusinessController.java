package org.maple.controller;

import org.maple.service.IBusinessService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author mapleins
 */
@RestController
public class BusinessController {

    @Resource
    private IBusinessService iBusinessService;

    @GetMapping("buyIt")
    public void buyIt(String userId, String commodityCode, int orderCount){
        iBusinessService.purchase(userId,commodityCode,orderCount);
    }
}
