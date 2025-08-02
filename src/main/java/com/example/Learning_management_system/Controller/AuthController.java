package com.example.Learning_management_system.Controller;

import com.example.Learning_management_system.DTO.ResponseDto;
import com.example.Learning_management_system.DTO.User.Req.UserLoginRequestDto;
import com.example.Learning_management_system.DTO.User.Req.UserRegisterRequestDto;
import com.example.Learning_management_system.Service.Auth.UserService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public String login(@RequestBody UserLoginRequestDto user) {
        return userService.verify(user);
    }

    @PostMapping("/register")
    public ResponseDto<UserLoginRequestDto> register(@RequestBody UserRegisterRequestDto user) {
        return userService.register(user);
    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }
}
