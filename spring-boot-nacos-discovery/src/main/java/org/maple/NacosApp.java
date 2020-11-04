package org.maple;

import com.alibaba.nacos.api.annotation.NacosInjected;
import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingService;
import com.alibaba.nacos.api.naming.pojo.Instance;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author mapleins
 * spring boot 集成 Nacos 实现服务发现
 *
 * 第一次调用，返回 []，通过 nacos OpenAPI 调用
 * curl -X PUT 'http://127.0.0.1:8848/nacos/v1/ns/instance?serviceName=example&ip=127.0.0.1&port=8080'
 * 添加一个服务后，再调用，可以看到返回了一个服务
 */
@SpringBootApplication
@RestController
public class NacosApp {

    public static void main(String[] args) {
        SpringApplication.run(NacosApp.class, args);
    }

    @NacosInjected
    private NamingService namingService;

    @GetMapping("/discovery")
    public List<Instance> get(@RequestParam String serviceName) throws NacosException {
        return namingService.getAllInstances(serviceName);
    }
}
