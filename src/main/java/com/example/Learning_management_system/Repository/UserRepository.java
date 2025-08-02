package com.example.Learning_management_system.Repository;

import com.example.Learning_management_system.Model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel , Integer> {
    public UserModel findByEmail(String email);
}
