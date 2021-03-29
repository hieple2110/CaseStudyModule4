package com.codegym.service;

import com.codegym.model.Product;
import com.codegym.model.ProductType;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface ProductService {


    public ArrayList<String> listResult(Product product);

    public   List<Product> findAllByIsDeleteIsFalse();

    List<Product> findAllByProductType(ProductType productType);

    public ArrayList<String> insert(Product product) throws SQLException;

    public ArrayList<String> update( Product product) throws SQLException;

    public ArrayList<String> delete(  Product product) throws SQLException;

    public Optional<Product> findById(int id) throws SQLException;

    public boolean checkDuplicate(Product product) throws SQLException;
}
