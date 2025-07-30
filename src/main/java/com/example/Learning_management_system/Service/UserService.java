package com.example.Learning_management_system.Service;

import com.example.Learning_management_system.DTO.User.Req.UserLoginRequestDto;
import com.example.Learning_management_system.DTO.User.Req.UserRegisterRequestDto;
import com.example.Learning_management_system.Model.UserModel;
import com.example.Learning_management_system.Repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserModel login(UserLoginRequestDto user) {
        return null;
    }

    public UserModel register(UserRegisterRequestDto user) {
        return null;
    }
}
