package com.app.vault_server;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class VaultController {

    @ResponseBody
    @GetMapping("/")
    private String greet() {
        return "Live";
    }
}
