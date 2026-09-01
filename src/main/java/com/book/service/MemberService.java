package com.book.service;

import com.book.common.PageResult;
import com.book.entity.Member;

public interface MemberService {

    Member login(String username, String password);

    boolean register(Member member);

    Member getById(Integer userId);

    boolean updateProfile(Member member);

    boolean updatePoints(Integer userId, int delta, String type);

    PageResult<Member> page(String keyword, int page, int pageSize);

    boolean setStatus(Integer userId, int status);
}
