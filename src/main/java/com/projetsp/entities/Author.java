package com.projetsp.entities;


import java.util.Set;

import jakarta.persistence.*;


@Entity
public class Author {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
	private String name;
	@OneToMany(cascade = CascadeType.ALL)
    private Set<Book> books;
	public Author() {
		super();
	}
	public Author(int id, String name, Set<Book> books) {
		super();
		this.id = id;
		this.name = name;
		this.books = books;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Book> getBooks() {
		return books;
	}
	public void setBooks(Set<Book> books) {
		this.books = books;
	}
	
}