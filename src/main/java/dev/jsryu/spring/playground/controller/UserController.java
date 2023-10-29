package dev.jsryu.spring.playground.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public interface UserController {
    public String hello();
}

@RestController
@RequestMapping("/users")
class UserControllerImpl implements UserController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello, User!";
    }
}
