package com.codegym.service;

import com.codegym.model.Customer;
import com.codegym.model.Order;
import com.codegym.model.Province;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface OrderService {
    List<Customer> findAllByIsDeleteIsFalse();

    public ArrayList<String> listResult(Order order);


    public ArrayList<String> insert(Customer customer) throws SQLException;

    public ArrayList<String> update(Customer customer) throws SQLException;

    public ArrayList<String> delete(Customer customer) throws SQLException;

    public Optional<Customer> findById(int id) throws SQLException;

    public boolean checkDuplicate(Customer customer) throws SQLException;
}
