package com.book.dao;

import com.book.entity.BookFavorite;

import java.util.List;

public interface FavoriteDao {

    List<BookFavorite> findByUserId(Integer userId);

    BookFavorite findByUserIdAndBookId(Integer userId, Integer bookId);

    int insert(BookFavorite favorite);

    int deleteByUserIdAndBookId(Integer userId, Integer bookId);
}
