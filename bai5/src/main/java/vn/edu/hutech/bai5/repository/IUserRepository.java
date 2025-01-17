package vn.edu.hutech.bai5.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.edu.hutech.bai5.model.User;

public interface IUserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
