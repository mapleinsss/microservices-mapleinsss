package org.maple.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mapleins
 * NacosPropertySource
 *      dataId:用于加载配置源
 *      autoRefreshed:开启自动更新
 *      groupId：用于分组，不写为默认分组 DEFAULT_GROUP
 * NacosValue：设置属性值，info 表示 key，Local Hello World 代表默认值（存在就不取默认值）
 */
@RestController
@NacosPropertySource(dataId = "example", autoRefreshed = true, groupId = "TEST_GROUP")
public class NacosConfigController {

    @NacosValue(value = "${info:Local Hello World}", autoRefreshed = true)
    private String info;

    @GetMapping("/config")
    public String get() {
        return info;
    }
}
