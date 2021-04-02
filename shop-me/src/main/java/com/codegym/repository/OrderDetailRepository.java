package com.codegym.repository;

import com.codegym.model.Customer;
import com.codegym.model.OrderDetail;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface OrderDetailRepository extends PagingAndSortingRepository<OrderDetail, Integer> {
    List<OrderDetail> findAllByIsDeleteIsFalse();


}
