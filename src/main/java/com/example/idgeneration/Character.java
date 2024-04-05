package com.example.idgeneration;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Character {

    @Id
    private String id;
    private String name;

    public Character(String id, String name) {
        this.id = id;
        this.name = name;
    }
}