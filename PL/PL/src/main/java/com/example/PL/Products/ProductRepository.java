package com.example.PL.Products;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

    // Listeleme
    List<ProductEntity> findAll();

    // Kaydetme
    ProductEntity save(ProductEntity product);

    // Silme
    void deleteById(Long id);
}