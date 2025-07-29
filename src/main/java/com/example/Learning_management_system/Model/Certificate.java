package com.example.Learning_management_system.Model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Certificate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long certificateId;

    private LocalDate issuedDate;
    private String certificateUrl;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private UserModel student;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;
}

