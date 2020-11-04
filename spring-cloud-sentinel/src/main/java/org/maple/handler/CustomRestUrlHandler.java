package org.maple.handler;

import com.alibaba.csp.sentinel.adapter.spring.webmvc.callback.UrlCleaner;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @author mapleins
 * 处理 restful 的 pathvariable 接口，否则，每个都是单独限流，会失效
 */
@Service
public class CustomRestUrlHandler implements UrlCleaner {
    @Override
    public String clean(String originUrl) {
        if(StringUtils.isEmpty(originUrl)){
            return originUrl;
        }
        if(originUrl.startsWith("/findAll/")){
            return "/findAll/*";
        }
        return originUrl;
    }
}
