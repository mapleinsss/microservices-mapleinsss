package org.maple;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author mapleins
 */
@SpringBootApplication
@DubboComponentScan
public class DubboNacosProviderApp {
    public static void main(String[] args) {
        SpringApplication.run(DubboNacosProviderApp.class, args);
    }
}
