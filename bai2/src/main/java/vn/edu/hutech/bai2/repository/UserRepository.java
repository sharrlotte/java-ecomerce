package vn.edu.hutech.bai2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.edu.hutech.bai2.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
