package com.wesle.bookstore;

import java.util.Arrays;

import com.wesle.bookstore.domain.Category;
import com.wesle.bookstore.domain.Book;
import com.wesle.bookstore.repositories.CategoryRepository;
import com.wesle.bookstore.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class BookstoreApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private BookRepository bookRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category cat1 = new Category(null, "Informatica", "Livros de TI");
		
		Book l1 = new Book(null, "Clean code", "Robert Martin", "Lorem ipsum", cat1);
		
		cat1.getBooks().addAll(Arrays.asList(l1));
		
		this.categoryRepository.saveAll(Arrays.asList(cat1));
		this.bookRepository.saveAll(Arrays.asList(l1));
		
		System.out.println("a qui");
	}

}
