package com.wesle.bookstore.repositories;


import com.wesle.bookstore.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
