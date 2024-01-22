package com.tiwilli.dscatalog.repositories;

import com.tiwilli.dscatalog.entities.Role;
import com.tiwilli.dscatalog.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByAuthority(String msg);
}
