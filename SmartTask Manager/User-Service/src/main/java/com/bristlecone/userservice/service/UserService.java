package com.bristlecone.userservice.service;

import com.bristlecone.userservice.dto.UserDto;

import java.util.List;

public interface UserService {

    public UserDto createUser(UserDto userDto);
    public UserDto getUserById(Long id);
    public List<UserDto> getAllUsers();
    public List<String> getUserNamesInUpperCase();
}
