package com.book.service;

import com.book.common.PageResult;
import com.book.entity.Book;

public interface BookService {

    PageResult<Book> page(String keyword, Integer categoryId, int page, int pageSize);

    Book getById(Integer bookId);

    boolean add(Book book);

    boolean update(Book book);

    boolean adjustStock(Integer bookId, int delta);

    boolean remove(Integer bookId);
}
