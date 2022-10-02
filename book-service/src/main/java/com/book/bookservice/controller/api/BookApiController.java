package com.book.bookservice.controller.api;

/*
Created by J.Fırat ©
    Date : 2.10.2022
    Time : 23:10
*/

import com.book.bookservice.domain.BookIdDTO;
import com.book.bookservice.dto.BookDTO;
import com.book.bookservice.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotEmpty;
import java.util.List;

@RestController
@RequestMapping("/api/v1/book")
@Validated
public class BookApiController {
    private final BookService bookService;

    public BookApiController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public ResponseEntity<List<BookDTO>> getAllBooks(){
        return ResponseEntity.ok(bookService.getAllBooks());
    }

    @GetMapping("/isbn/{isbn}")
    public ResponseEntity<BookIdDTO> findBookByIsbn(@PathVariable @NotEmpty String isbn){
        return ResponseEntity.ok(bookService.findByIsbn(isbn));
    }

    @GetMapping("/book/{isbn}")
    public ResponseEntity<BookDTO> findBookByIsbn(@PathVariable Long id,@PathVariable @NotEmpty String isbn){
        return ResponseEntity.ok(bookService.findBookDetailsByIdAndIsbn(id,isbn));
    }
}
