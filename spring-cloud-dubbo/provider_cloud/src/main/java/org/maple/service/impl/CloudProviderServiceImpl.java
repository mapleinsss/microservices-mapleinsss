package org.maple.service.impl;

import org.apache.dubbo.config.annotation.DubboService;
import org.maple.service.ICloudService;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author mapleins
 */
@DubboService
public class CloudProviderServiceImpl implements ICloudService {

    @Value("${dubbo.application.name}")
    private String serviceName;

    @Override
    public String sayHello(String name) {
        return String.format("[%s] : Hello, %s", serviceName, name);
    }
}
