package com.tiwilli.dscatalog.repositories;

import com.tiwilli.dscatalog.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
