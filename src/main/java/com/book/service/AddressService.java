package com.book.service;

import com.book.entity.ReceiverAddress;

import java.util.List;

public interface AddressService {

    List<ReceiverAddress> list(Integer userId);

    boolean add(ReceiverAddress address);

    boolean update(ReceiverAddress address);

    boolean remove(Integer addressId, Integer userId);

    boolean setDefault(Integer addressId, Integer userId);
}
