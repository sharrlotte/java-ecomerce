package vn.edu.hutech.bai5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.edu.hutech.bai5.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
