package org.maple;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author mapleins
 */
@SpringBootApplication
@DubboComponentScan
public class DncProviderApp {
    public static void main(String[] args) {
        SpringApplication.run(DncProviderApp.class, args);
    }
}
