package com.book.dao.impl;

import com.book.dao.CartDao;
import com.book.entity.CartItem;

import java.util.Collections;
import java.util.List;

public class CartDaoImpl implements CartDao {

    @Override
    public List<CartItem> findByUserId(Integer userId) {
        // TODO 查询会员购物车
        return Collections.emptyList();
    }

    @Override
    public CartItem findByUserIdAndBookId(Integer userId, Integer bookId) {
        // TODO 查询购物车中指定图书
        return null;
    }

    @Override
    public int insert(CartItem cartItem) {
        // TODO 新增购物车条目
        return 0;
    }

    @Override
    public int updateQuantity(Integer cartId, int quantity) {
        // TODO 修改购物车数量
        return 0;
    }

    @Override
    public int deleteByCartId(Integer cartId) {
        // TODO 删除购物车条目
        return 0;
    }

    @Override
    public int clearByUserId(Integer userId) {
        // TODO 清空购物车
        return 0;
    }
}
