package com.book.service;

import com.book.entity.CartItem;

import java.util.List;

public interface CartService {

    List<CartItem> list(Integer userId);

    boolean add(Integer userId, Integer bookId, int quantity);

    boolean updateQuantity(Integer userId, Integer bookId, int quantity);

    boolean remove(Integer userId, Integer bookId);

    boolean clear(Integer userId);
}
