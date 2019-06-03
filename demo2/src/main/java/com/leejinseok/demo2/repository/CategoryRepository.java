package com.leejinseok.demo2.repository;

import com.leejinseok.demo2.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
