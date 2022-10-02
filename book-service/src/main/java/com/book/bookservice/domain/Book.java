package com.book.bookservice.domain;

import lombok.Data;
import lombok.Getter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Where;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/*
Created by J.Fırat ©
    Date : 2.10.2022
    Time : 22:31
*/
@Entity
@Table(name = "Book")
@Where(clause ="status = 1")
@Data
public class Book {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private Long id;
    private String bookName;
    private String authorName;
    private String bookYear;
    private String isbn;
}
