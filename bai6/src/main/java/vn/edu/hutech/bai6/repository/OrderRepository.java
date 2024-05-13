package vn.edu.hutech.bai6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.edu.hutech.bai6.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
