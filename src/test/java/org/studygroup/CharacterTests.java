package org.studygroup;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CharacterTests {

    Character character;

    @BeforeEach
    public void init(){
        character = new Character("NOME", "CLASSE", "Pilantra bebedor de chorume", "Yoda", "SRD", "Bebum");
    }

    @Test
    public void shouldCreateCharacter(){
        Assertions.assertEquals("NOME", character.getCharacterName());
        Assertions.assertEquals("CLASSE", character.getCharacterClass());
        Assertions.assertEquals(1, character.getLevel());
        Assertions.assertEquals("Pilantra bebedor de chorume", character.getBackground());
        Assertions.assertEquals("Yoda", character.getPlayerName());
        Assertions.assertEquals("SRD", character.getRace());
        Assertions.assertEquals("Bebum", character.getAlignment());
        Assertions.assertEquals(0, character.getExperiencePoints());
    }

    @Test
    public void shouldAddLevel(){
        Assertions.assertEquals(1, character.getLevel());
        character.addLevel();
        Assertions.assertEquals(2, character.getLevel());
    }

    @Test
    public void shouldAddExperiencePoints(){
        Assertions.assertEquals(0, character.getExperiencePoints());
        character.addExperiencePoints(200);
        Assertions.assertEquals(200, character.getExperiencePoints());
    }
}
