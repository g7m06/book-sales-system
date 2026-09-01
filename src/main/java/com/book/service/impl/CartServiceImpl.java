package com.book.service.impl;

import com.book.dao.CartDao;
import com.book.dao.impl.CartDaoImpl;
import com.book.entity.CartItem;
import com.book.service.CartService;

import java.util.Collections;
import java.util.List;

public class CartServiceImpl implements CartService {

    private final CartDao cartDao = new CartDaoImpl();

    @Override
    public List<CartItem> list(Integer userId) {
        // TODO 购物车列表业务
        return Collections.emptyList();
    }

    @Override
    public boolean add(Integer userId, Integer bookId, int quantity) {
        // TODO 加入购物车业务
        return false;
    }

    @Override
    public boolean updateQuantity(Integer userId, Integer bookId, int quantity) {
        // TODO 修改数量业务
        return false;
    }

    @Override
    public boolean remove(Integer userId, Integer bookId) {
        // TODO 删除购物车条目业务
        return false;
    }

    @Override
    public boolean clear(Integer userId) {
        // TODO 清空购物车业务
        return false;
    }
}
