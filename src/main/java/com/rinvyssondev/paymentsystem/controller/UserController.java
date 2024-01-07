package com.rinvyssondev.paymentsystem.controller;

import com.rinvyssondev.paymentsystem.dto.UserRequest;
import com.rinvyssondev.paymentsystem.dto.UserResponse;
import com.rinvyssondev.paymentsystem.entity.User;
import com.rinvyssondev.paymentsystem.service.UserService;
import jakarta.mail.MessagingException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<UserResponse> registerUser(@RequestBody @Valid UserRequest userRequest) throws UnsupportedEncodingException, MessagingException {
        User user = userRequest.toModel();
        UserResponse userSaved = userService.registerUser(user);
        return ResponseEntity.ok().body(userSaved);
    }

    @GetMapping("/verify")
    public String verifyUser(@Param("code") String code){
        if (userService.verify(code)) {
            return "verify_success";
        } else {
            return "verify_fail";
        }
    }
}
