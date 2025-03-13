package edu.miu.cs.cs425.lab10.repository;

import edu.miu.cs.cs425.lab10.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username); // Ensure this returns Optional<User>
}