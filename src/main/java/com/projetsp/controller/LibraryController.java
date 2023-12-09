package com.projetsp.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.projetsp.entities.*;
import com.projetsp.service.LibraryService;

@RestController
@RequestMapping("/api/library")       
public class LibraryController {

    @Autowired
    private LibraryService libraryService;

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return libraryService.getAllBooks();
    }

    @GetMapping("/books/{id}")
    public Book getBookById(@PathVariable Long id) {
        return libraryService.getBookById(id);
    }

    @PostMapping("/books")
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
        return libraryService.createBook(book);
    }

   /* @PutMapping("/books/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable Long id, @RequestBody Book book) {
        return libraryService.updateBook(id, book);
    }*/
/*
    @DeleteMapping("/books/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable Long id) {
        return libraryService.deleteBook(id);
    }*/

    
}

