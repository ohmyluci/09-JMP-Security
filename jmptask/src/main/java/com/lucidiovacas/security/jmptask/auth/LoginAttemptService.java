package com.lucidiovacas.security.jmptask.auth;

import org.springframework.stereotype.Service;

import java.util.concurrent.ConcurrentHashMap;

@Service
public class LoginAttemptService {

    private final Integer MAX_ATTEMPTS = 3;

    private final ConcurrentHashMap<String, Integer> attemptsCache;

    public LoginAttemptService() {
        attemptsCache = new ConcurrentHashMap<>(1000);
    }

    public void loginSucceeded(String username) {
        attemptsCache.remove(username);
    }

    public void loginFailed(String username) {
        int attempts = 0;
        try {
            attempts = attemptsCache.get(username);
        } catch (Exception e) {
            attempts = 0;
        }
        attempts++;
        attemptsCache.put(username, attempts);
    }

    public Boolean isBlocked(String username) {
        try {
            return attemptsCache.get(username) >= MAX_ATTEMPTS;
        } catch (Exception e) {
            return false;
        }

    }


}
