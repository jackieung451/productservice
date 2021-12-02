package com.jack.springcloud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jack.springcloud.model.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {

}
