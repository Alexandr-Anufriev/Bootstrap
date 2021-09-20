package com.anufriev.BootExperience.service;

import com.anufriev.BootExperience.model.Role;
import com.anufriev.BootExperience.repository.RoleRepo;
import com.anufriev.BootExperience.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class RoleServiceImpl implements RoleService{

    private final UserRepo userRepo;
    private final RoleRepo roleRepo;

    @Autowired
    public RoleServiceImpl(UserRepo userRepo, RoleRepo roleRepo) {
        this.userRepo = userRepo;
        this.roleRepo = roleRepo;
    }

    @Override
    public List<Role> allRoles() {
        return roleRepo.findAll();
    }

    @Override
    public Role getRole(String role) {
        return roleRepo.findByName(role);
    }
}
