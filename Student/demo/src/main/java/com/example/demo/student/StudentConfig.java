package com.example.demo.student;

import com.example.demo.student.model.Student;
import com.example.demo.student.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return  args -> {
            Student ziad = new Student
                    ( "Ziad", "ziadytma@gmail.com",
                            LocalDate.of(2002, JANUARY, 7));

            Student achraf = new Student
                    ( "Achraf", "achrafben@gmail.com",
                            LocalDate.of(1995, JANUARY, 29)) ;
            repository.saveAll(List.of(
                    ziad,achraf)
            );
        };
    }
}
