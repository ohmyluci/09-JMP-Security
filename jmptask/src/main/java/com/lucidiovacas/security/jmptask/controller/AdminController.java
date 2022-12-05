package com.lucidiovacas.security.jmptask.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/admin")
@Slf4j
public class AdminController {

    @GetMapping("status")
    public ResponseEntity<String> getStatus() {
        log.info("Getting admin controller status");
        return new ResponseEntity<>("Up and running", HttpStatus.OK);
    }

}
