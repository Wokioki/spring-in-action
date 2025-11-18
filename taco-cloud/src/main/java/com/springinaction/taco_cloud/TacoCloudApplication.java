package com.springinaction.taco_cloud;

import com.springinaction.taco_cloud.model.User;
import com.springinaction.taco_cloud.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class TacoCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(TacoCloudApplication.class, args);
    }


    @Bean
    public CommandLineRunner dataLoader(UserRepository userRepo,
                                        PasswordEncoder passwordEncoder) {
        return args -> {

            if (userRepo.findByUsername("testuser") == null) {
                User user = new User(
                        "testuser",
                        passwordEncoder.encode("password"),
                        "Test User",
                        "Test Street 1",
                        "Test City",
                        "TS",
                        "00-000",
                        "+123456789"
                );
                userRepo.save(user);
            }
        };
    }
}
