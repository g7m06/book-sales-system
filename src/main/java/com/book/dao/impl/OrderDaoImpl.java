package com.book.dao.impl;

import com.book.dao.OrderDao;
import com.book.entity.Order;
import com.book.entity.OrderItem;

import java.util.Collections;
import java.util.List;

public class OrderDaoImpl implements OrderDao {

    @Override
    public int insertOrder(Order order) {
        // TODO 新增订单主表
        return 0;
    }

    @Override
    public int insertOrderItem(OrderItem orderItem) {
        // TODO 新增订单明细
        return 0;
    }

    @Override
    public List<Order> findByUserId(Integer userId) {
        // TODO 查询会员订单
        return Collections.emptyList();
    }

    @Override
    public Order findById(Integer orderId) {
        // TODO 查询订单详情
        return null;
    }

    @Override
    public int updateStatus(Integer orderId, int status) {
        // TODO 更新订单状态
        return 0;
    }

    @Override
    public List<OrderItem> findItemsByOrderId(Integer orderId) {
        // TODO 查询订单明细
        return Collections.emptyList();
    }
}
