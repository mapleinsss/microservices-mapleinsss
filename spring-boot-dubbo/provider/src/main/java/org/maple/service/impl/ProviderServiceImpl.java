package org.maple.service.impl;

import org.apache.dubbo.config.annotation.DubboService;
import org.maple.service.IService;

/**
 * @author mapleins
 * 服务提供者接口实现类
 * 通过 @DubboService 标注服务类
 */
@DubboService
public class ProviderServiceImpl implements IService {

    @Override
    public String sayHello(String name) {
        return "hello, " + name;
    }
}
