package org.maple.service;

/**
 * @author mapleins
 */
public interface IBusinessService {

    /**
     *  采购
     */
    void purchase(String userId, String commodityCode, int orderCount);
}
