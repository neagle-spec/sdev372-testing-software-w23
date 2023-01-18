package com.example.projectundervcs.controllers;

import com.example.projectundervcs.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    private List<Book> booksList = List.of(
        new Book("The sword of destiny", "andrzej", 384),
        new Book("Lord d'Arcy Investigates", "Randal", 229)
    );

    @GetMapping("books")
    public List<Book> getAllBooks(){
        return booksList;
    }
}
