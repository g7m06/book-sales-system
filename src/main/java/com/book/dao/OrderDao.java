package com.book.dao;

import com.book.entity.Order;
import com.book.entity.OrderItem;

import java.util.List;

public interface OrderDao {

    int insertOrder(Order order);

    int insertOrderItem(OrderItem orderItem);

    List<Order> findByUserId(Integer userId);

    Order findById(Integer orderId);

    int updateStatus(Integer orderId, int status);

    List<OrderItem> findItemsByOrderId(Integer orderId);
}
