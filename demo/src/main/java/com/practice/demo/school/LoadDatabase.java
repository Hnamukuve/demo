package com.practice.demo.school;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(TeacherRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new Teacher(1,"Jane Williams", 22, "Science" )));
            log.info("Preloading " + repository.save(new Teacher(2, "Nancy Lake", 40, "English")));
            log.info("Preloading " + repository.save(new Teacher(3, "Brian Tedd", 36, "Literature")));
        };
    }
}
