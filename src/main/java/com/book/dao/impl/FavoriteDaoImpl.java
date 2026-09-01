package com.book.dao.impl;

import com.book.dao.FavoriteDao;
import com.book.entity.BookFavorite;

import java.util.Collections;
import java.util.List;

public class FavoriteDaoImpl implements FavoriteDao {

    @Override
    public List<BookFavorite> findByUserId(Integer userId) {
        // TODO 查询会员收藏列表
        return Collections.emptyList();
    }

    @Override
    public BookFavorite findByUserIdAndBookId(Integer userId, Integer bookId) {
        // TODO 查询是否已收藏
        return null;
    }

    @Override
    public int insert(BookFavorite favorite) {
        // TODO 新增收藏
        return 0;
    }

    @Override
    public int deleteByUserIdAndBookId(Integer userId, Integer bookId) {
        // TODO 取消收藏
        return 0;
    }
}
