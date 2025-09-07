package com.example.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class StudentManagementApplication {
    public static void main(String[] args) {
        SpringApplication.run(StudentManagementApplication.class, args);
    }

    // sample data
    @Bean
    CommandLineRunner initData(StudentRepository repo) {
        return args -> {
            repo.save(new Student("John", "Doe", "john@example.com", "Computer Science", LocalDate.of(2000,1,15)));
            repo.save(new Student("Jane", "Smith", "jane@example.com", "Business", LocalDate.of(2001,5,23)));
        };
    }
}
