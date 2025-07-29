package com.example.Learning_management_system.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long enrollmentId;

    private LocalDateTime enrolledAt;
    private Double progress;
    private Boolean completed;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private UserModel student;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;
}

