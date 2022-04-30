package com.example.keycloak.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TestController {

    @GetMapping(value = "/public/main")
    public ResponseEntity<String> permitAll() {
        return ResponseEntity.ok("PUBLIC MAIN\n");
    }

    @GetMapping(value = "/auth/main")
    public ResponseEntity<String> auth(@RequestHeader String Authorization) {
        log.debug(Authorization);
        return ResponseEntity.ok("AUTH MAIN\n");
    }

    @GetMapping(value = "/user/main")
    public ResponseEntity<String> user(@RequestHeader String Authorization) {
        log.debug(Authorization);
        return ResponseEntity.ok("USER MAIN\n");
    }

    @GetMapping(value = "/admin/main")
    public ResponseEntity<String> admin(@RequestHeader String Authorization) {
        log.debug(Authorization);
        return ResponseEntity.ok("ADMIN MAIN\n");
    }


}
