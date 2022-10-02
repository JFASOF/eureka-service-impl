package com.book.bookservice.handler.exception;

/*
Created by J.Fırat ©
    Date : 2.10.2022
    Time : 23:01
*/


public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(String s) {
        super(s);
    }

}
