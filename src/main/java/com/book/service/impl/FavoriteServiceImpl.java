package com.book.service.impl;

import com.book.dao.FavoriteDao;
import com.book.dao.impl.FavoriteDaoImpl;
import com.book.entity.BookFavorite;
import com.book.service.FavoriteService;

import java.util.Collections;
import java.util.List;

public class FavoriteServiceImpl implements FavoriteService {

    private final FavoriteDao favoriteDao = new FavoriteDaoImpl();

    @Override
    public List<BookFavorite> list(Integer userId) {
        // TODO 收藏列表业务
        return Collections.emptyList();
    }

    @Override
    public boolean add(Integer userId, Integer bookId) {
        // TODO 添加收藏业务
        return false;
    }

    @Override
    public boolean remove(Integer userId, Integer bookId) {
        // TODO 取消收藏业务
        return false;
    }
}
