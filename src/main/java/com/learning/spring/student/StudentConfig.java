package com.learning.spring.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student rakib = new Student("Rakib", "rakib@gmail.com", LocalDate.of(1994, 12, 20), 10);
            Student raisa = new Student("Raisa", "raisa@gmail.com", LocalDate.of(1996, 12, 10), 20);
            repository.saveAll(List.of(rakib, raisa));
        };
    }

}
