package com.example.SpringMoment.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner runner(StudentRepository repository){
        return args -> {
            Student mariam = new Student(
                    1L,
                    "Mariam",
                    "eternity_cr9p@mail.ru",
                    LocalDate.of(1980, Month.DECEMBER,28)
            );
            Student alex = new Student(
                    2L,
                    "Alex",
                    "onelive321@mail.ru",
                    LocalDate.of(1990, Month.APRIL,15)
            );
            repository.saveAll(
                    List.of(mariam,alex)
            );
        };
    }
}
