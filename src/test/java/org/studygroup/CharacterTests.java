package org.studygroup;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.studygroup.races.Aasimar;
import org.studygroup.races.AasimarSubRace;

public class CharacterTests {

    Character character;

    @BeforeEach
    public void init(){
        Aasimar aasimar = new Aasimar(AasimarSubRace.CAIDO, 50, "1,90m 80kg");
        character = new Character("NOME", "CLASSE", "Pilantra bebedor de chorume", "Yoda", aasimar);
    }

    @Test
    public void shouldCreateCharacter(){
        Assertions.assertEquals("NOME", character.getCharacterName());
        Assertions.assertEquals("CLASSE", character.getCharacterClass());
        Assertions.assertEquals(1, character.getLevel());
        Assertions.assertEquals("Pilantra bebedor de chorume", character.getBackground());
        Assertions.assertEquals("Yoda", character.getPlayerName());
        Assertions.assertInstanceOf(Aasimar.class, character.getRace());
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
