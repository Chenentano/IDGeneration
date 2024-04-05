package com.example.idgeneration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
public class CharacterService {

    private IdService idService;

    @Autowired
    public CharacterService(IdService idService) {
        this.idService = idService;
    }

    public com.example.idgeneration.Character addCharacter(String name) {
        String id = idService.generateRandomId();
        com.example.idgeneration.Character character = new com.example.idgeneration.Character(id, name);
        return character;
    }
}