package com.example.EmployeeManagement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(Employee.builder()
                    .firstName("Bilbo")
                    .lastName("Baggins")
                    .email("bilbo@warner.com")
                    .role("burglar")
                    .salary("9000")
                    .build()));

            log.info("Preloading " + repository.save(Employee.builder()
                    .firstName("Frodo")
                    .lastName("Baggins")
                    .email("frodo@warner.com")
                    .role("thief")
                    .salary("18000")
                    .build()));
        };
    }
}
