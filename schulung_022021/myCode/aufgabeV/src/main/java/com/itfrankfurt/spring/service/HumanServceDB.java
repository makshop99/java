package com.itfrankfurt.spring.service;

import com.itfrankfurt.spring.entity.Animal;
import com.itfrankfurt.spring.entity.Human;
import com.itfrankfurt.spring.repository.HumanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("humanDB")
public class HumanServceDB implements HumanService
{
    @Autowired
    HumanRepository humanRepo;

    @Override
    public List<Human> getAllHumanList()
    {
        return humanRepo.findAll();
    }

    @Override
    public Human addHuman(Human human)
    {
        return HumanRepository.save(human);
    }
}
