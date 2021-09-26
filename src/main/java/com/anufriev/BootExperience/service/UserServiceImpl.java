package com.anufriev.BootExperience.service;

import com.anufriev.BootExperience.model.Role;
import com.anufriev.BootExperience.model.User;
import com.anufriev.BootExperience.repository.RoleRepo;
import com.anufriev.BootExperience.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepo userRepo;
    private final RoleRepo roleRepo;

    @Autowired
    public UserServiceImpl(UserRepo userRepo, RoleRepo roleRepo) {
        this.userRepo = userRepo;
        this.roleRepo = roleRepo;
    }

    @Override
    public List<User> allUsers() {
        return userRepo.findAll();
    }

    @Override
    public void addUser(User user) {
        userRepo.save(user);
    }

    @Override
    public void update(User updatedUser) {
        userRepo.save(updatedUser);
    }

    @Override
    public void delete(User user) {
        userRepo.delete(user);
    }

    @Override
    public Set<Role> usersRole(User user) {
        return null;
    }

    @Override
    public User getUserByName(String username) {
        return userRepo.findByUsername(username);
    }

    @Override
    public User getUserById(Long userId) {
        return userRepo.findById(userId).get();
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return userRepo.findByEmail(email);
    }
}
