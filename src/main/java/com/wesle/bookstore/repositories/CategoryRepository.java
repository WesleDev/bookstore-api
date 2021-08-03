package com.wesle.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wesle.bookstore.domain.Categoria;

@Repository
public interface CategoryRepository extends JpaRepository<Categoria, Integer> {

}
