package com.codegym.repository;

import com.codegym.model.Product;
import com.codegym.model.ProductType;
import com.codegym.model.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findAllByIsDeleteIsFalse();

    List<Product> findAllByProductType(ProductType productType);
}
