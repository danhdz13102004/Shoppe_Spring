package com.example.my_shoppe.dao;

import com.example.my_shoppe.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
//    public List<CategoryRepository> findAll();
}
