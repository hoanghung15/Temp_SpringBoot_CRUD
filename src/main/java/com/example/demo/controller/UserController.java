package com.example.demo.controller;

import com.example.demo.dto.request.UserCreateRequest;
import com.example.demo.dto.request.UserUpdateRequest;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping
    User createUser(@RequestBody @Valid UserCreateRequest request){
        return userService.createUser(request);
    }
    @GetMapping
    List<User>getUsers(){
        return userService.getUsers();
    }
    @GetMapping("/{userID}")
    User getUser(@PathVariable String userID){
        return userService.getUser(userID);
    }
    @PutMapping("/{userID}")
    User updateUser(@PathVariable String userID, @RequestBody UserUpdateRequest request){
        return userService.updateUser(userID,request);
    }
    @DeleteMapping("/{userID}")
    List<User> deleteUserAndGetList(@PathVariable String userID) {
        return userService.deleteUser(userID);
    }

}
