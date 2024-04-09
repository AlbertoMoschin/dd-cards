package org.studygroup.abilities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.studygroup.TestsConstants.*;

public class StrenghtTests {

    Strength strength;

    @BeforeEach
    public void init(){
        strength = new Strength(POINTS_12, SAVING_THROW_TRUE, ATHLETICS_TRUE, PROFICIENCY_BONUS_5);
    }

    @Test
    public void shouldCreateStrength(){
        Assertions.assertEquals(Abilities.STRENGTH, strength.getAbility());
        Assertions.assertEquals(12, strength.getPoints());
        Assertions.assertTrue(strength.isSavingThrow());
        Assertions.assertEquals(6, strength.getSavingThrowValor());
        Assertions.assertEquals("Skill{skillName='athletics', selectedSkill=true, skillTemp=false, skillValor=6}", strength.getAthletics().toString());
    }

    @Test
    public void shouldGetStrength(){
        Assertions.assertNotNull(strength.getAthletics());
    }

    @Test
    public void shouldSetAbilitySkillsValor(){
        Assertions.assertEquals(6, strength.getAthletics().getSkillValor());

        strength.setAbilitySkillsValor(6);

        Assertions.assertEquals(7, strength.getAthletics().getSkillValor());
    }
}
