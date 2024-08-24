package main.java.com.architech.user.v1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    
    @GetMapping("/helloWorld")
    public String helloWorld() {
        return "Hello World from User Service!";
    }
}
