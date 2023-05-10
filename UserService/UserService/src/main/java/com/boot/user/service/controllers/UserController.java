package com.boot.user.service.controllers;

import com.boot.user.service.entities.User;
import com.boot.user.service.reporsitories.UserRepository;
import com.boot.user.service.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    //create


    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){

        User user1 = userService.saveUser(user);
        HttpHeaders httpHeaders = new HttpHeaders();
        //httpHeaders.add("Allow");
        return ResponseEntity.status(HttpStatus.CREATED).body(user1);
    }

//    @PostMapping
//    public User createUser(@RequestBody User user){
//
//      //  User user1 = userService.saveUser(user);
//        return userRepository.save(user);
//    }

    //single user get
    @GetMapping("/{userId}")
    public ResponseEntity<User> getSingleUser(@PathVariable String userId){

        User user = userService.getUser(userId);
        return ResponseEntity.ok(user);
    }

    //all user get

    @GetMapping
    public ResponseEntity<List<User>> getAllUser(){

        List<User> allUser = userService.getAllUser();
        return ResponseEntity.ok(allUser);
    }

}
