package org.maple.service.impl;

import org.apache.dubbo.config.annotation.DubboService;
import org.maple.api.IStorageService;
import org.maple.dao.StorageDao;

import javax.annotation.Resource;

/**
 * @author mapleins
 */
@DubboService
public class StorageService implements IStorageService {

    @Resource
    private StorageDao storageDao;

    @Override
    public void deduct(String commodityCode, int count) {
        storageDao.deduct(commodityCode, count);
    }
}
