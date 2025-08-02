package com.example.Learning_management_system.Service.Auth;

import com.example.Learning_management_system.DTO.ResponseDto;
import com.example.Learning_management_system.DTO.User.Req.UserLoginRequestDto;
import com.example.Learning_management_system.DTO.User.Req.UserRegisterRequestDto;
import com.example.Learning_management_system.Model.UserModel;
import com.example.Learning_management_system.Repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private JwtService jwtService;

    @Autowired
    AuthenticationManager authenticationManager;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    public String verify(UserLoginRequestDto user) {
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(user.getEmail() , user.getPassword()));
        System.out.println(authentication);
        if (authentication.isAuthenticated()) {
            return jwtService.generateToken(user);
        } else {
            return "Some thing wrong";
        }
    }

    public ResponseDto<UserLoginRequestDto> register(UserRegisterRequestDto user) {
        UserModel userModel = new UserModel();
        userModel.setName(user.getName());
        userModel.setEmail(user.getEmail());
        userModel.setPassword(encoder.encode(user.getPassword()));
        userModel.setRole(user.getRole());
        userModel.setProfilePicture(user.getProfilePicture());
        userModel.setBio(user.getBio());
        userRepository.save(userModel);

        UserLoginRequestDto userLoginRequestDto = new UserLoginRequestDto(userModel.getEmail(), userModel.getPassword());

        return new ResponseDto<>(userLoginRequestDto, true);
    }
}
