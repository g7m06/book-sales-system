package com.book.service.impl;

import com.book.dao.OrderDao;
import com.book.dao.impl.OrderDaoImpl;
import com.book.entity.Order;
import com.book.service.OrderService;

import java.util.Collections;
import java.util.List;

public class OrderServiceImpl implements OrderService {

    private final OrderDao orderDao = new OrderDaoImpl();

    @Override
    public Order createOrder(Integer userId, Order order) {
        // TODO 创建订单业务
        return null;
    }

    @Override
    public boolean pay(Integer orderId) {
        // TODO 模拟支付业务
        return false;
    }

    @Override
    public boolean cancel(Integer orderId) {
        // TODO 取消订单业务
        return false;
    }

    @Override
    public boolean ship(Integer orderId) {
        // TODO 发货业务
        return false;
    }

    @Override
    public boolean complete(Integer orderId) {
        // TODO 完成订单并累计积分业务
        return false;
    }

    @Override
    public List<Order> listByUser(Integer userId) {
        // TODO 查询会员订单业务
        return Collections.emptyList();
    }

    @Override
    public Order detail(Integer orderId) {
        // TODO 订单详情业务
        return null;
    }
}
