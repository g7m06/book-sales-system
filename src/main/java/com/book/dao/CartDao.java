package com.book.dao;

import com.book.entity.CartItem;

import java.util.List;

public interface CartDao {

    List<CartItem> findByUserId(Integer userId);

    CartItem findByUserIdAndBookId(Integer userId, Integer bookId);

    int insert(CartItem cartItem);

    int updateQuantity(Integer cartId, int quantity);

    int deleteByCartId(Integer cartId);

    int clearByUserId(Integer userId);
}
