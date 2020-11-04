package org.maple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author mapleins
 */
@SpringBootApplication
public class CloudNacosConfigApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(CloudNacosConfigApp.class, args);
        String info = context.getEnvironment().getProperty("info");
        System.out.println(info);
    }
}
