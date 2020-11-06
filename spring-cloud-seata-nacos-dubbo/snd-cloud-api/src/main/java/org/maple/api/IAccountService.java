package org.maple.api;

/**
 * @author mapleins
 */
public interface IAccountService {

    /**
     * 从用户账户中借出
     */
    void debit(String userId, int money);
}
