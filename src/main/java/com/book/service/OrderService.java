package com.book.service;

import com.book.entity.Order;

import java.util.List;

public interface OrderService {

    Order createOrder(Integer userId, Order order);

    boolean pay(Integer orderId);

    boolean cancel(Integer orderId);

    boolean ship(Integer orderId);

    boolean complete(Integer orderId);

    List<Order> listByUser(Integer userId);

    Order detail(Integer orderId);
}
