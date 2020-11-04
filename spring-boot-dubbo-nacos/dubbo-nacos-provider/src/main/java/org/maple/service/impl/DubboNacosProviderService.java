package org.maple.service.impl;

import org.apache.dubbo.config.annotation.DubboService;
import org.maple.service.IService;

/**
 * @author mapleins
 */
@DubboService
public class DubboNacosProviderService implements IService {

    @Override
    public String sayHello(String name) {
        return "hello, " + name;
    }
}
