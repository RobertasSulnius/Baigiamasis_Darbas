package com.example.BuySellApplication.repositories;

import com.example.BuySellApplication.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAllByTitleContaining(String title);
}
