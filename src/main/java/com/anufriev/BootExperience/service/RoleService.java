package com.anufriev.BootExperience.service;

import com.anufriev.BootExperience.model.Role;

import java.util.List;

public interface RoleService {
    List<Role> allRoles();

    Role getRole(String role);
}
