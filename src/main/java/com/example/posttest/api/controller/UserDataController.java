package com.example.posttest.api.controller;

import com.example.posttest.api.entities.UserDataEntity;
import com.example.posttest.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/UserData")

public class UserDataController {

    @Autowired
    UserRepository userRepository;

    @PostMapping(value = "addNewUser")
    public UserDataEntity addNewUser(@RequestBody UserDataEntity param) {
        userRepository.save(param);
        return param;
    }

    @GetMapping(value = "getAllUser")
    public List<UserDataEntity> getAllUser() {
        return userRepository.findAll();
    }

    @GetMapping(value = "getByID")
    public UserDataEntity getByID(@RequestParam int id){
        return userRepository.findById(id).get();
    }

    @PostMapping(value = "updateUser")
    public String updateUser(@RequestBody UserDataEntity param) {
        return userRepository.save(param).toString();
    }

    @GetMapping(value = "deleteUser")
    public String deleteUser(@RequestParam int id){
        userRepository.deleteById(id);
        return "Success delete user data at id: "+id;
    }

}
