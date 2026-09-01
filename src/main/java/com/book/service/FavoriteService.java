package com.book.service;

import com.book.entity.BookFavorite;

import java.util.List;

public interface FavoriteService {

    List<BookFavorite> list(Integer userId);

    boolean add(Integer userId, Integer bookId);

    boolean remove(Integer userId, Integer bookId);
}
