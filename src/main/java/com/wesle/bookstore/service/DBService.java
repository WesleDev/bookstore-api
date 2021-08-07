package com.wesle.bookstore.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wesle.bookstore.domain.Book;
import com.wesle.bookstore.domain.Category;
import com.wesle.bookstore.repositories.BookRepository;
import com.wesle.bookstore.repositories.CategoryRepository;

@Service
public class DBService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private BookRepository bookRepository;
	
	public void instanceBaseOfData() {
		Category cat1 = new Category(null, "Informatica", "Livros de TI");
		Category cat2 = new Category(null, "Ficção", "Livros de Ficção");
		Category cat3 = new Category(null, "Biografias", "Livros de Biografia");
		
		Book l1 = new Book(null, "Clean code", "Robert Martin", "Lorem ipsum", cat1);
		Book l2 = new Book(null, "Engenharia de Software", "Louis V.", "Lorem ipsum", cat1);
		Book l3 = new Book(null, "The Time Machine", "Wells", "Lorem ipsum", cat2);
		Book l4 = new Book(null, "The War of the Worlds", "Wells", "Lorem ipsum", cat2);
		Book l5 = new Book(null, "I, Robot", "Isaac A.", "Lorem ipsum", cat2);
		
		
		cat1.getBooks().addAll(Arrays.asList(l1, l2));
		cat2.getBooks().addAll(Arrays.asList(l3, l4, l5));
		
		this.categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		this.bookRepository.saveAll(Arrays.asList(l1, l2, l3, l4, l5));
	}
}
