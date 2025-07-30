package com.example.Learning_management_system.DTO.User.Req;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserRegisterRequestDto {
    private String name;
    private String email;
    private String password;
    private String role;
    private String profilePicture;
    private String bio;
}
