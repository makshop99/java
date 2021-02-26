package com.itfrankfurt.spring.config;

import com.itfrankfurt.spring.entity.Animal;
import com.itfrankfurt.spring.entity.Human;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

public class HumanConfig
{
    @Bean
    public List<Human> testHuman()
    {
        List<Human> db = new ArrayList<>();
        db.add(new Human("Peter Parker", 180, "Spiderman"));
        db.add(new Human("Peter Pan",130, "long term child"));
        db.add(new Human("Peter Rutschwurst",184, "common specialist"));
        return db;
    }
}
