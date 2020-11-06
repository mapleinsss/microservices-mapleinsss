package org.maple.service.impl;

import org.apache.dubbo.config.annotation.DubboService;
import org.maple.api.IAccountService;
import org.maple.dao.AccountDao;

import javax.annotation.Resource;

/**
 * @author mapleins
 */
@DubboService
public class AccountService implements IAccountService {

    @Resource
    private AccountDao accountDao;

    @Override
    public void debit(String userId, int money) {
        accountDao.debit(money,userId);
    }
}
