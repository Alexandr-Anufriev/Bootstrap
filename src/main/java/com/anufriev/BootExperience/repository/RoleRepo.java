package com.anufriev.BootExperience.repository;

import com.anufriev.BootExperience.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepo extends JpaRepository<Role, Long> {
    Role findByName(String roleName);
    boolean existsByName(String roleName);
}