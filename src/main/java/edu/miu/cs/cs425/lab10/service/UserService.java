package edu.miu.cs.cs425.lab10.service;

import edu.miu.cs.cs425.lab10.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    void registerUser(User user);
}