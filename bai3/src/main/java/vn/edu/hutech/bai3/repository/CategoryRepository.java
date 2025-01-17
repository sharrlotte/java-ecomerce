package vn.edu.hutech.bai3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.edu.hutech.bai3.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
