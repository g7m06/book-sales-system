package com.book.service;

import com.book.entity.BookComment;

import java.util.List;

public interface CommentService {

    List<BookComment> listByBook(Integer bookId);

    List<BookComment> listByUser(Integer userId);

    boolean add(BookComment comment);

    boolean remove(Integer commentId);
}
