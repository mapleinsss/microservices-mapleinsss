package org.maple.service.impl;

import org.maple.service.ICloudService;

/**
 * @author mapleins
 */
public class DegradeCloudService implements ICloudService {
    @Override
    public String sayHello(String name) {
        return String.format("服务发生降级了，返回我这条数据呢，%s", name);
    }
}
