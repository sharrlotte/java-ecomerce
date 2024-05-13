package vn.edu.hutech.bai5.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.edu.hutech.bai5.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
