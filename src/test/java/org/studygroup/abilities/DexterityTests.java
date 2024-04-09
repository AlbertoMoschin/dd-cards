package org.studygroup.abilities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.studygroup.TestsConstants.*;

public class DexterityTests {

    Dexterity dexterity;

    @BeforeEach
    public void init(){
        dexterity = new Dexterity(POINTS_12, SAVING_THROW_TRUE, ACROBATICS_TRUE, STEALTH_FALSE, SLEIGHT_OF_HAND_TRUE, PROFICIENCY_BONUS_5);
    }

    @Test
    public void shouldCreateDexterity(){
        Assertions.assertEquals(Abilities.DEXTERITY, dexterity.getAbility());
        Assertions.assertEquals(12, dexterity.getPoints());
        Assertions.assertTrue(dexterity.isSavingThrow());
        Assertions.assertEquals(6, dexterity.getSavingThrowValor());
        Assertions.assertEquals("Skill{skillName='acrobatics', selectedSkill=true, skillTemp=false, skillValor=6}", dexterity.getAcrobatics().toString());
        Assertions.assertEquals("Skill{skillName='stealth', selectedSkill=false, skillTemp=false, skillValor=1}", dexterity.getStealth().toString());
        Assertions.assertEquals("Skill{skillName='sleightOfHand', selectedSkill=true, skillTemp=false, skillValor=6}", dexterity.getSleightOfHand().toString());
    }

    @Test
    public void shouldGetAcrobatics(){
        Assertions.assertNotNull(dexterity.getAcrobatics());
    }

    @Test
    public void shouldGetStealth(){
        Assertions.assertNotNull(dexterity.getStealth());
    }

    @Test
    public void shouldGetSleightOfHand(){
        Assertions.assertNotNull(dexterity.getSleightOfHand());
    }

    @Test
    public void shouldSetAbilitySkillsValor(){
        Assertions.assertEquals(6, dexterity.getAcrobatics().getSkillValor());
        Assertions.assertEquals(1, dexterity.getStealth().getSkillValor());
        Assertions.assertEquals(6, dexterity.getSleightOfHand().getSkillValor());

        dexterity.setAbilitySkillsValor(6);

        Assertions.assertEquals(7, dexterity.getAcrobatics().getSkillValor());
        Assertions.assertEquals(1, dexterity.getStealth().getSkillValor());
        Assertions.assertEquals(7, dexterity.getSleightOfHand().getSkillValor());
    }
}
