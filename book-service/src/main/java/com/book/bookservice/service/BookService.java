package com.book.bookservice.service;

import com.book.bookservice.domain.BookIdDTO;
import com.book.bookservice.dto.BookDTO;

import java.util.List;
import java.util.Optional;

/*
Created by J.Fırat ©
    Date : 2.10.2022
    Time : 22:38
*/
public interface BookService {
    List<BookDTO> getAllBooks();
    BookIdDTO findByIsbn(String isbn);
    BookDTO findBookDetailsByIdAndIsbn(Long id,String isbn);
}
