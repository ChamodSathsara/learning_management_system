package com.example.Learning_management_system.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    private String name;
    private String email;
    private String password;
    private String role; // "admin", "instructor", "student"
    private String profilePicture;
    private String bio;

    @OneToMany(mappedBy = "instructor")
    private List<Course> courses;

    @OneToMany(mappedBy = "student")
    private List<Enrollment> enrollments;

    @OneToMany(mappedBy = "student")
    private List<Submission> submissions;

    @OneToMany(mappedBy = "student")
    private List<Review> reviews;

    @OneToMany(mappedBy = "student")
    private List<Certificate> certificates;
}
