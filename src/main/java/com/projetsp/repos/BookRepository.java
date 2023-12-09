package com.projetsp.repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetsp.entities.*;

public interface BookRepository extends JpaRepository<Book , Long>{
	
	Optional<Book> findByIsbn(Long isbn);

}
