package ru.montana.spring.testoffrontandback.service;

import ru.montana.spring.testoffrontandback.models.Piktovec;
import org.springframework.stereotype.Component;

@Component
public class ShowPict {


    public void show(Piktovec piktovec){
        System.out.println(piktovec);

    }
}
