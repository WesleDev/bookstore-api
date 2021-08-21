package com.wesle.bookstore.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.wesle.bookstore.domain.Category;

public class CategoryDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	@NotEmpty(message = "Campo NAME é requerido")
	@Length(min = 3, max = 100, message = "O campo NAME deve ter entre 3 e 100 caracteres")
	private String name;
	
	@NotEmpty(message = "Campo DESCRIPTION é requerido")
	@Length(min = 3, max = 200, message = "O campo DESCRIPTION deve ter entre 3 e 200 caracteres")
	private String description;

	
	public CategoryDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CategoryDTO(Category obj) {
		super();
		this.id = obj.getId();
		this.name = obj.getName();
		this.description = obj.getDescription();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
