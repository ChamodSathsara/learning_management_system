package com.example.Learning_management_system.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseId;

    private String title;
    private String description;
    private String duration;
    private String status; // pending, approved, rejected
    private Double averageRating;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @ManyToOne
    @JoinColumn(name = "instructor_id")
    private UserModel instructor;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryModel category;

    @OneToMany(mappedBy = "course")
    private List<Lecture> lectures;

    @OneToMany(mappedBy = "course")
    private List<Assignment> assignments;

    @OneToMany(mappedBy = "course")
    private List<Quiz> quizzes;

    @OneToMany(mappedBy = "course")
    private List<Enrollment> enrollments;

    @OneToMany(mappedBy = "course")
    private List<Review> reviews;

    @OneToMany(mappedBy = "course")
    private List<Certificate> certificates;
}
