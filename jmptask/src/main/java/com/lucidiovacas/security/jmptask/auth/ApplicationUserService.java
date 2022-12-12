package com.lucidiovacas.security.jmptask.auth;

import com.lucidiovacas.security.jmptask.model.User;
import com.lucidiovacas.security.jmptask.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ApplicationUserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private LoginAttemptService loginAttemptService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepo.findByUsername(username);
        if (loginAttemptService.isBlocked(username)) {
            log.info("User {} blocked", username);
        }

        if(user == null) {
            throw new UsernameNotFoundException(username);
        }
        return new ApplicationUser(user);
    }
}
