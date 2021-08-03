package com.wesle.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wesle.bookstore.domain.Livro;

@Repository
public interface BookRepository extends JpaRepository<Livro, Integer> {

}
