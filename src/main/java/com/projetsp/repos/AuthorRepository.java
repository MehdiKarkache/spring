package com.projetsp.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetsp.entities.*;

public interface AuthorRepository extends JpaRepository<Author , Long>{

}
