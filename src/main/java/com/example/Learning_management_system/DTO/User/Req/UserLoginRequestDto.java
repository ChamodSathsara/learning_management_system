package com.example.Learning_management_system.DTO.User.Req;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserLoginRequestDto {
    private String email;
    private String password;
}
