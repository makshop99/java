package com.itfrankfurt.spring.service;

import com.itfrankfurt.spring.entity.Animal;
import com.itfrankfurt.spring.entity.Human;

import java.util.List;

public interface HumanService
{
    public List<Human> getAllHumanList();
    public Human addHuman(Human human);
}
