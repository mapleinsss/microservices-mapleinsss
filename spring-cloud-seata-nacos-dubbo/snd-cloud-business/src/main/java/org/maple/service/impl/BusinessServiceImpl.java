package org.maple.service.impl;

import org.apache.dubbo.config.annotation.DubboReference;
import org.maple.api.IOrderService;
import org.maple.api.IStorageService;
import org.maple.service.IBusinessService;
import org.springframework.stereotype.Service;

/**
 * @author mapleins
 */
@Service
public class BusinessServiceImpl implements IBusinessService {

    @DubboReference
    private IOrderService iOrderService;
    @DubboReference
    private IStorageService iStorageService;

    @Override
    public void purchase(String userId, String commodityCode, int orderCount) {
        iStorageService.deduct(commodityCode, orderCount);
        iOrderService.create(userId, commodityCode, orderCount);
    }
}
