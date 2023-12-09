package com.projetsp.entities;

import jakarta.persistence.*;


@Entity
public class Book {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private long isbn;
	private String title;
	@ManyToOne
    @JoinColumn(name="Author_id", nullable=false)
    private Author author;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getIsbn() {
		return isbn;
	}
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public Book(int id, long isbn, String title, Author author) {
		super();
		this.id = id;
		this.isbn = isbn;
		this.title = title;
		this.author = author;
	}
	public Book() {
		super();
	}
	
	

}
