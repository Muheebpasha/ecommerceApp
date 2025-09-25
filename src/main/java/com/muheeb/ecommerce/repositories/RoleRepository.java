package com.muheeb.ecommerce.repositories;

import com.muheeb.ecommerce.model.AppRole;
import com.muheeb.ecommerce.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public class RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleName(AppRole appRole);
}
