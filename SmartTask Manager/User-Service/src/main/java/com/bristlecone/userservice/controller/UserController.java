package com.bristlecone.userservice.controller;

import com.bristlecone.userservice.dto.UserDto;
import com.bristlecone.userservice.service.UserService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto) {

        UserDto userDto1 = userService.createUser(userDto);
        return new ResponseEntity<>(userDto1, HttpStatus.CREATED);

    }

    @GetMapping("{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable("id") Long id) {

        UserDto userDto = userService.getUserById(id);
        return ResponseEntity.ok(userDto);

    }

    @GetMapping
    public ResponseEntity<List<UserDto>> getAllUsers() {

        List<UserDto> userDtos = userService.getAllUsers();
        return ResponseEntity.ok(userDtos);

    }

    @GetMapping("usernames")
    public ResponseEntity<List<String>> getAllUserNamesInUpperCase() {

        return new ResponseEntity<>(userService.getUserNamesInUpperCase(),  HttpStatus.OK);

    }
}
