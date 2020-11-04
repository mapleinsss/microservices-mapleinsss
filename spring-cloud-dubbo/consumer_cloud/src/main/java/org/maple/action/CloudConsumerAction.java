package org.maple.action;

import org.apache.dubbo.config.annotation.DubboReference;
import org.maple.service.ICloudService;
import org.springframework.stereotype.Component;

/**
 * @author mapleins
 *  cluster 6 种方式实现集群容错，也可以自己实现
 *  loadbalance 实现负载均衡
 *  mock 实现服务降级
 */
@Component
public class CloudConsumerAction {

    @DubboReference(mock = "org.maple.service.impl.DegradeCloudService",
            cluster = "failfast", loadbalance = "roundrobin")
    private ICloudService iService;

    public String sayHello(String name) {
        return iService.sayHello(name);
    }
}
