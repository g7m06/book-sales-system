package com.book.dao;

import com.book.entity.Book;

import java.util.List;

public interface BookDao {

    List<Book> findByCondition(String keyword, Integer categoryId, int page, int pageSize);

    Book findById(Integer bookId);

    int insert(Book book);

    int update(Book book);

    int updateStock(Integer bookId, int delta);

    int deleteById(Integer bookId);
}
