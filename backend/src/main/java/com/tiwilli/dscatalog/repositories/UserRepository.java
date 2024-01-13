package com.tiwilli.dscatalog.repositories;

import com.tiwilli.dscatalog.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
