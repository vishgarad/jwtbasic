package com.example.demo.repositary;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Book;

// Spring Data magic :)
public interface BookRepository extends JpaRepository<Book, Long> {
}