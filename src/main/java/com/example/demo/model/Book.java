package com.example.demo.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Book {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String author;
	private BigDecimal price;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
//	public void setAuthor(String author) {
//		this.author = author;
//	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Book(String name, String author, BigDecimal price) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
	}
	public Book() {
		super();
	}
	public void setAuthor(String author2) {
		// TODO Auto-generated method stub
		this.author = author;
		
	}
	

}
