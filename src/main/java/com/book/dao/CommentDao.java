package com.book.dao;

import com.book.entity.BookComment;

import java.util.List;

public interface CommentDao {

    List<BookComment> findByBookId(Integer bookId);

    List<BookComment> findByUserId(Integer userId);

    int insert(BookComment comment);

    int deleteById(Integer commentId);
}
