package com.bristlecone.taskservice.service;

import com.bristlecone.taskservice.dto.UserDto;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class UserClient {

    @Autowired
    private RestTemplate restTemplate;

    public boolean isUserExists(Long id){

        try {
            ResponseEntity<UserDto> response = restTemplate.getForEntity("http://localhost:8080/api/users/" + id, UserDto.class);
            return response.getStatusCode().is2xxSuccessful();
        } catch (Exception e){
            return false;
        }

    }
}
