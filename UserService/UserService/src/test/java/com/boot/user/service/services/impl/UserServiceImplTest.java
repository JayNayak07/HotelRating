package com.boot.user.service.services.impl;

import com.boot.user.service.entities.User;
import com.boot.user.service.reporsitories.UserRepository;
import com.boot.user.service.services.UserService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class UserServiceImplTest {

    @MockBean
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @Test
    void getAllUser() {

        userService.getAllUser();
        Mockito.verify(userRepository).findAll();
    }

}