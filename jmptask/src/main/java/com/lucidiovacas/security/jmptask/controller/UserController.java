package com.lucidiovacas.security.jmptask.controller;

import com.lucidiovacas.security.jmptask.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.lucidiovacas.security.jmptask.mockdata.MockData.USERS;

@RestController
@RequestMapping("/api/v1/user")
@Slf4j
public class UserController {

    @GetMapping("/all")
    public ResponseEntity<List<User>> getAllUsers() {
        log.info("Getting all users");
        return new ResponseEntity<>(USERS, HttpStatus.OK);
    }

}
