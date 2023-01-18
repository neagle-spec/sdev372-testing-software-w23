package com.example.projectundervcs;

import com.example.projectundervcs.model.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectUnderVcsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectUnderVcsApplication.class, args);

        Book book = new Book();

        Book defaultBook = new Book();
    }

}
