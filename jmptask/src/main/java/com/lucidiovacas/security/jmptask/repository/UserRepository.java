package com.lucidiovacas.security.jmptask.repository;

import com.lucidiovacas.security.jmptask.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    public User findByUsername(String username);
    public User findByEmail(String email);
}
