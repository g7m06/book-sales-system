package com.book.dao;

import com.book.entity.Member;

import java.util.List;

public interface MemberDao {

    Member findByUsername(String username);

    Member findById(Integer userId);

    int insert(Member member);

    int updateProfile(Member member);

    int updatePoints(Integer userId, int delta);

    int updateStatus(Integer userId, int status);

    List<Member> findByCondition(String keyword, int page, int pageSize);
}
