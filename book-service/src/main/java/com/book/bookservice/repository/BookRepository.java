package com.book.bookservice.repository;

/*
Created by J.Fırat ©
    Date : 2.10.2022
    Time : 22:37
*/

import com.book.bookservice.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, String> {
    Optional<Book> findByIsbn(String isbn);
}

