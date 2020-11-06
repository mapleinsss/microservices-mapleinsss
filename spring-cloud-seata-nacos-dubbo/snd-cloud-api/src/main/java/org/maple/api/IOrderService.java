package org.maple.api;


/**
 * @author mapleins
 */
public interface IOrderService {

    /**
     * 创建订单
     */
    void create(String userId, String commodityCode, int orderCount);
}
