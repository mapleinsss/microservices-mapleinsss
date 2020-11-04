package org.maple.action;

import org.apache.dubbo.config.annotation.DubboReference;
import org.maple.service.IService;
import org.springframework.stereotype.Component;

/**
 * @author mapleins
 */
@Component
public class DubboNacosConsumerAction {

    @DubboReference
    private IService iService;

    public String sayHello(String name) {
        return iService.sayHello(name);
    }
}
