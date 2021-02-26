package com.itfrankfurt.spring.controller;

import com.itfrankfurt.spring.entity.Animal;
import com.itfrankfurt.spring.entity.Human;
import com.itfrankfurt.spring.service.AnimalService;
import com.itfrankfurt.spring.service.HumanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@RequestMapping("/api")
public class HumanController
{
    //    @Autowired
    private List<Human> testHuman;

    //    @Autowired
//    @Qualifier("setImpl")
    private HumanService humanService;

    @Autowired
    public HumanController(List<Human> testHuman, @Qualifier("humanDB") HumanService humanService)
    {
        this.humanService = humanService;
        this.testHuman = testHuman;
    }


    @PostConstruct
    public void postConstruct() {

        testHuman.stream().forEach(a -> humanService.addHuman(a));
    }

    public HumanController() {
    }

    @GetMapping("/humans")
    public List<Human> getAllHumans() {
        return null;
    }

    @PostMapping("/human")
    public Human createHuman(@RequestBody Human human) {
        return null;
    }

    @DeleteMapping("/human/{id}")
    public void deleteHuman(@PathVariable Long id) {

    }

    @GetMapping("/human/{id}")
    public ResponseEntity<Human> findAnimalById(@PathVariable Long id) {
        return null;
    }

    @GetMapping("/human/{name}/{height}")
    public ResponseEntity<Human> findHumanByNameAndBiggerThenHeight(@PathVariable String name, @PathVariable int height) {
        // Gibt einen Menschen zurück, der den Namen 'name' hat und größer ist als 'height'
        return null;
    }

    @GetMapping("/human/{job}")
    public List<Human> findAllHumansWithJobOrderedByName(@PathVariable String job) {
        // Gibt alle Menschen mit einer entsprechenden Jobbeschreibung zurück und sortiert diese nach ihrem Namen
        return null;
    }
}