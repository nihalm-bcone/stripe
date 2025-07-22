package com.bristlecone.userservice.service.impl;

import com.bristlecone.userservice.dto.UserDto;
import com.bristlecone.userservice.entity.User;
import com.bristlecone.userservice.exception.UserNotFoundException;
import com.bristlecone.userservice.repository.UserRepository;
import com.bristlecone.userservice.service.UserService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public UserDto createUser(UserDto userDto) {

        User user = modelMapper.map(userDto, User.class);
        user.setCreatedAt(LocalDate.now());
        User savedUser = userRepository.save(user);
        return modelMapper.map(savedUser, UserDto.class);

    }

    @Override
    public UserDto getUserById(Long id) {

        User user = userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User with "+id+" not found"));
        return modelMapper.map(user, UserDto.class);

    }

    @Override
    public List<UserDto> getAllUsers() {

        return userRepository.findAll()
                .stream()
                .map(user -> modelMapper.map(user, UserDto.class))
                .collect(Collectors.toList());

    }

    @Override
    public List<String> getUserNamesInUpperCase() {

        return userRepository.findAll()
                .stream()
                .map(user -> user.getName().toUpperCase())
                .collect(Collectors.toList());

    }
}
