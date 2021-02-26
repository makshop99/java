package com.itfrankfurt.spring.repository;

import com.itfrankfurt.spring.entity.Animal;
import com.itfrankfurt.spring.entity.Human;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface HumanRepository extends JpaRepository<Human,Long>
{
    // public Optional<Animal> findAnimalByName(String name);
    // public void deleteAnimalByName(String name);
    // public List<Animal> findAllByNameAndWeightIsGreaterThanOrderByWeight(String name, int weight);
}
