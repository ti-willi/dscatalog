package com.tiwilli.dscatalog.repositories;

import com.tiwilli.dscatalog.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
