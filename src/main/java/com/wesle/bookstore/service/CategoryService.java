package com.wesle.bookstore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.wesle.bookstore.domain.Category;
import com.wesle.bookstore.dto.CategoryDTO;
import com.wesle.bookstore.repositories.CategoryRepository;
import com.wesle.bookstore.service.exceptions.ObjectNotFoundException;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;

	public Category findById(Integer id) {
		Optional<Category> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrato! Id: " + id + ", Tipo: " + Category.class.getName()));
	}

	public List<Category> findAll() {
		return repository.findAll();
	}

	public Category create(Category obj) {
		obj.setId(null);
		return repository.save(obj);
	}

	public Category update(Integer id, CategoryDTO objDto) {
		Category obj = findById(id);
		obj.setName(objDto.getName());
		obj.setDescription(objDto.getDescription());
		return repository.save(obj);
	}

	public void delete(Integer id) {
		findById(id);
		try {
			repository.deleteById(id);
		} catch (DataIntegrityViolationException e) {
			throw new com.wesle.bookstore.service.exceptions.DataIntegrityViolationException(
					"Categoria não pode ser deletada! Possui Livros associados.");
		}
	}
}
