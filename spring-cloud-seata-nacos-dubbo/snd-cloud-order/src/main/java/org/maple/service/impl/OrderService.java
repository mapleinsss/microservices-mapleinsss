package org.maple.service.impl;

import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;
import org.maple.api.IAccountService;
import org.maple.api.IOrderService;
import org.maple.dao.OrderDao;
import org.maple.domain.Order;

import javax.annotation.Resource;

/**
 * @author mapleins
 */
@DubboService
public class OrderService implements IOrderService {

    @Resource
    private OrderDao orderDao;
    @DubboReference
    private IAccountService iAccountService;

    @Override
    public void create(String userId, String commodityCode, int orderCount) {
        // 设置商品的价格为10元
        int orderMoney = 10 * orderCount;
        // 扣款
        iAccountService.debit(userId, orderMoney);

        Order order = new Order();
        order.setUserId(userId);
        order.setCommodityCode(commodityCode);
        order.setCount(orderCount);
        order.setMoney(orderMoney);
        // 保存订单
        orderDao.insert(order);
    }
}
