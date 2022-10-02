package com.book.bookservice.dto;

import com.book.bookservice.domain.Book;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
Created by J.Fırat ©
    Date : 2.10.2022
    Time : 22:41
*/
@Getter
@Setter
@NoArgsConstructor
public class BookDTO {
    private String bookName;
    private String authorName;
    private String bookYear;
    private String isbn;

    public static BookDTO toDto(Book book){
        BookDTO bookDTO = new BookDTO();
        bookDTO.setBookName(book.getBookName());
        bookDTO.setAuthorName(book.getAuthorName());
        bookDTO.setBookYear(book.getBookYear());
        bookDTO.setIsbn(book.getIsbn());
        return bookDTO;
    }
}
