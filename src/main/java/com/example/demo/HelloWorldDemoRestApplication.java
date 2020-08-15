package com.example.demo;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.Book;
import com.example.demo.repositary.BookRepository;

@SpringBootApplication
public class HelloWorldDemoRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldDemoRestApplication.class, args);
	}
//	 @Bean
//	    CommandLineRunner initDatabase(BookRepository repository) {
//	        return args -> {
//	            repository.save(new Book("A Guide to the Bodhisattva Way of Life", "Santideva", new BigDecimal("15.41")));
//	            repository.save(new Book("The Life-Changing Magic of Tidying Up", "Marie Kondo", new BigDecimal("9.69")));
//	            repository.save(new Book("Refactoring: Improving the Design of Existing Code", "Martin Fowler", new BigDecimal("47.99")));
//	        };
//	    }
	 
	 
}
