package com.lucidiovacas.security.jmptask.controller;

import com.lucidiovacas.security.jmptask.dto.Metric;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/open-metrics")
@Slf4j
public class OpenMetricsController {

    @GetMapping("/basic")
    public ResponseEntity<Metric> getBasicMetrics() {
        log.info("Getting basic open metrics");
        Metric metric = new Metric();
        return new ResponseEntity<>(metric, HttpStatus.OK);
    }

}
