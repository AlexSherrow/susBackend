package com.susBackend.controller;
import com.susBackend.entity.User;
import com.susBackend.services.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    final String url = "http://localhost:3000";
    @Autowired
    private UserService userService;
    
    @CrossOrigin(origins = url)
    @GetMapping("/getAllUsers")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
    
}
