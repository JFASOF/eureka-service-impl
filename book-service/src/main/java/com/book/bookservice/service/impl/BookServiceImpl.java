package com.book.bookservice.service.impl;

/*
Created by J.Fırat ©
    Date : 2.10.2022
    Time : 22:40
*/

import com.book.bookservice.domain.BookIdDTO;
import com.book.bookservice.dto.BookDTO;
import com.book.bookservice.handler.exception.BookNotFoundException;
import com.book.bookservice.repository.BookRepository;
import com.book.bookservice.service.BookService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<BookDTO> getAllBooks() {
        return bookRepository.findAll()
                .stream()
                .map(BookDTO::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public BookIdDTO findByIsbn(String isbn) {
        return bookRepository.findByIsbn(isbn)
                //ISBN ile sorgulandığı zaman id ve isbn bilgileri döndürülür.
                .map(book -> new BookIdDTO(book.getId(), book.getIsbn()))
                .orElseThrow(()-> new BookNotFoundException("Book not found with isbn : " + isbn));
    }
}
