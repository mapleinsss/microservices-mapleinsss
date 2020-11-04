package org.maple.controller;

import com.alibaba.nacos.api.annotation.NacosProperties;
import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * todo 这里获取不到
 */
@RestController
public class NacosConfigController {

    @NacosValue(value = "${info:Local Hello World}", autoRefreshed = true)
    private String info;

    @GetMapping("/get")
    public String get() {
        return info;
    }
}
