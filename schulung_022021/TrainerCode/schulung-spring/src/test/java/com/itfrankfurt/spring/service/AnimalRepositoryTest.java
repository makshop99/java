package com.itfrankfurt.spring.service;

import com.itfrankfurt.spring.entity.Animal;
import com.itfrankfurt.spring.repository.AnimalRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
//@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class AnimalRepositoryTest {

    @Autowired
    AnimalRepository animalRepository;

    @Test
    public void getAllAndAddTest() {
        assertEquals(animalRepository.findAll().size(),0);
        animalRepository.save(new Animal("Tester", 100, true, "mail@mail.de"));
        assertEquals(animalRepository.findAll().size(),1);

    }
//
//    @Test
//    public void getAnimalByNameTest() {
//        assertEquals(animalService.getAllAnimals().size(),0);
//        animalService.addAnimal(new Animal("TestName", 100, true,"mail@mail.de"));
//        assertTrue(animalService.getAnimalByName("TestName").isPresent());
//        assertTrue(animalService.getAnimalByName("NichtGefunden").isEmpty());
//    }
//
//    @Test
//    public void deleteAnimalByNameTest() {
//        animalService.addAnimal(new Animal("ToDelete", 100, true,"mail@mail.de"));
//        assertTrue(animalService.getAnimalByName("ToDelete").isPresent());
//        animalService.deleteAnimalByName("ToDelete");
//        assertFalse(animalService.getAnimalByName("ToDelete").isPresent());
//    }
}
