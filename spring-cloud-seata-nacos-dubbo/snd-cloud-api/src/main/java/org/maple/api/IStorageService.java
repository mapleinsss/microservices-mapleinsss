package org.maple.api;

/**
 * @author mapleins
 */
public interface IStorageService {

    /**
     * 扣除存储数量
     */
    void deduct(String commodityCode, int count);
}
