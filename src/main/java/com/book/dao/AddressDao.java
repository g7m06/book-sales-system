package com.book.dao;

import com.book.entity.ReceiverAddress;

import java.util.List;

public interface AddressDao {

    List<ReceiverAddress> findByUserId(Integer userId);

    ReceiverAddress findById(Integer addressId);

    int insert(ReceiverAddress address);

    int update(ReceiverAddress address);

    int deleteById(Integer addressId);

    int setDefault(Integer addressId, Integer userId);
}
