package com.ronitdev.LocalHotel.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ronitdev.LocalHotel.entity.User;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByEmail(String email);

    Optional<User> findByEmail(String email);
}
