package com.itfrankfurt.spring.controller;

import com.itfrankfurt.spring.entity.Animal;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.annotation.DirtiesContext;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
@AutoConfigureTestDatabase
public class AnimalControllerTest {

    @Autowired
    TestRestTemplate testRestTemplate;

    @Test
    public void getAllAndAddTest() {
        Animal animal = new Animal("Testanimal", 100, true, "animal@gmail.com");
        ResponseEntity<Animal> response = testRestTemplate.postForEntity("/api/animal", animal, Animal.class);
        assertTrue(response.getStatusCode().is2xxSuccessful());
        assertNotNull(response.getBody().getId());

        List<Animal> allAnimals = (List<Animal>) testRestTemplate.getForObject("/api/animals", List.class);
        assertEquals(allAnimals.size(), 1);

    }
}
