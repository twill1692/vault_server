package com.app.vault_server.Books;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @GetMapping("/hello")
    private String hello() {
        String greeting = "Hi, you!";
        return greeting;
    }
}
