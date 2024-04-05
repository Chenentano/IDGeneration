package com.example.idgeneration.service;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import com.example.idgeneration.Character;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CharacterServiceTest {

    @Mock
    private IdService idService;

    @InjectMocks
    private CharacterService characterService;

    @Test
    public void testAddCharacter() {
        when(idService.generateRandomId()).thenReturn("mocked-id");

        Character character = characterService.addCharacter("Test Character");

        assertNotNull(character);
        assertNotNull(character.getId());
    }
}