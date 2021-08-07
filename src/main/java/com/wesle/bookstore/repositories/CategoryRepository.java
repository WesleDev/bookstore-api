package com.wesle.bookstore.repositories;


import com.wesle.bookstore.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
