package com.itfrankfurt.spring.service;

import com.itfrankfurt.spring.entity.Animal;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
@AutoConfigureTestDatabase
public class AnimalServiceH2Test {

    @Autowired
    @Qualifier("h2Impl")
    AnimalService animalService;

    @Test
    public void getAllAndAddTest() {
        assertEquals(animalService.getAllAnimals().size(),0);
        animalService.addAnimal(new Animal("tester", 100, true,"mail@mail.de"));
        assertEquals(animalService.getAllAnimals().size(),1);
    }

    @Test
    public void getAnimalByNameTest() {
        assertEquals(animalService.getAllAnimals().size(),0);
        animalService.addAnimal(new Animal("TestName", 100, true,"mail@mail.de"));
        assertTrue(animalService.getAnimalByName("TestName").isPresent());
        assertTrue(animalService.getAnimalByName("NichtGefunden").isEmpty());
    }

    @Test
    public void deleteAnimalByNameTest() {
        animalService.addAnimal(new Animal("ToDelete", 100, true,"mail@mail.de"));
        assertTrue(animalService.getAnimalByName("ToDelete").isPresent());
        animalService.deleteAnimalByName("ToDelete");
        assertFalse(animalService.getAnimalByName("ToDelete").isPresent());
    }
}
