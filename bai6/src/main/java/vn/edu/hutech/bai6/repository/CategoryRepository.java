package vn.edu.hutech.bai6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.edu.hutech.bai6.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
