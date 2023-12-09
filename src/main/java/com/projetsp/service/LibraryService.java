package com.projetsp.service;

import java.util.List;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.projetsp.entities.*;
import com.projetsp.repos.*;


@Service
public class LibraryService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private AuthorRepository authorRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @SuppressWarnings("deprecation")
	public Book getBookById(Long id) {
        return bookRepository.getById(id);
    }


    public ResponseEntity<Book> createBook(Book book) {
        
        if (bookRepository.findByIsbn(book.getIsbn()).isPresent()) {
            return ResponseEntity.badRequest().body(null);
        }
        Book createdBook = bookRepository.save(book);
        return ResponseEntity.status(201).body(createdBook);
    }

   /* public ResponseEntity<Book> updateBook(Long id, Book updatedBook) {
        Optional<Book> existingBookOptional = bookRepository.findById(id);

        if (existingBookOptional.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        Book existingBook = existingBookOptional.get();

        // Update the fields of the existing book
        existingBook.setTitle(updatedBook.getTitle());
        existingBook.setIsbn(updatedBook.getIsbn());
        existingBook.setAuthor(updatedBook.getAuthor());

        // You can add more validation or update logic here if needed

        // Save the updated book to the database
        Book updatedBookInDb = bookRepository.save(existingBook);

        // Return the updated book and a 200 OK status
    }*/

    

    
}

