package org.maple.action;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Component;
import org.maple.service.IService;

/**
 * @author mapleins
 */
@Component
public class ConsumerAction {

    @DubboReference
    private IService iService;

    public String sayHello(String name) {
        return iService.sayHello(name);
    }
}
