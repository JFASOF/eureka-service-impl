package com.book.bookservice.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
Created by J.Fırat ©
    Date : 2.10.2022
    Time : 22:54
*/
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookIdDTO {
    private Long id;
    private String isbn;

    public static BookIdDTO toDto(Long id, String isbn){
        BookIdDTO bookIdDTO = new BookIdDTO();
        bookIdDTO.setId(id);
        bookIdDTO.setIsbn(isbn);
        return bookIdDTO;
    }
}
