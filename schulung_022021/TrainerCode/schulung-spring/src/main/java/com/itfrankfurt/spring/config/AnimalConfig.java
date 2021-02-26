package com.itfrankfurt.spring.config;


import com.itfrankfurt.spring.entity.Animal;
import com.itfrankfurt.spring.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;
import org.springframework.core.env.Environment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class AnimalConfig {

    @Autowired
    AnimalRepository animalRepository;

    @Autowired
    String mySecretPassword;

    @Autowired
    Environment environment;
    @EventListener(ApplicationReadyEvent.class)
    public void afterStartup() {
        //animalRepository.save() ...
        System.out.println("Technical username is: " + technicalUser);
        System.out.println("Technical password is: " + technicalUserPassword);
        boolean isNotProd = Arrays.stream(environment.getActiveProfiles()).noneMatch(profile -> profile.equals("prod"));
        if(isNotProd) {
            System.out.println("Technical password is: " + mySecretPassword);
        }
    }

    @Value("${technical.user.username}")
    private String technicalUser;

    @Value("${technical.user.password}")
    private String technicalUserPassword;

    @Bean
    public String mySecretPassword( @Value("${technical.user.password}") String password){
        return password;
    }

    @Bean
    public List<Animal> testAnimals() {
        List<Animal> db = new ArrayList<>();
        db.add(new Animal("Vogel",1, true, "test@test.de"));
        db.add(new Animal("Fisch",5, false,"test@test.de"));
        db.add(new Animal("Tiger",100, false,"test@test.de"));
        return db;
    }
}
