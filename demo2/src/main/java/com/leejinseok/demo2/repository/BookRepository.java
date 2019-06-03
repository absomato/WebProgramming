package com.leejinseok.demo2.repository;

import com.leejinseok.demo2.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
