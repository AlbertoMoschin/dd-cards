package org.studygroup.abilities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.studygroup.TestsConstants.*;

public class CharismaTests {

    Charisma charisma;

    @BeforeEach
    public void init(){
        charisma = new Charisma(POINTS_12, SAVING_THROW_TRUE, PERFORMANCE_TRUE, DECEPTION_TRUE, INTIMIDATION_FALSE, PERSUASION_FALSE, PROFICIENCY_BONUS_5);
    }

    @Test
    public void shouldCreateCharisma(){
        Assertions.assertEquals(Abilities.CHARISMA, charisma.getAbility());
        Assertions.assertEquals(12, charisma.getPoints());
        Assertions.assertTrue(charisma.isSavingThrow());
        Assertions.assertEquals(6, charisma.getSavingThrowValor());
        Assertions.assertEquals("Skill{skillName='performance', selectedSkill=true, skillTemp=false, skillValor=6}", charisma.getPerformance().toString());
        Assertions.assertEquals("Skill{skillName='deception', selectedSkill=true, skillTemp=false, skillValor=6}", charisma.getDeception().toString());
        Assertions.assertEquals("Skill{skillName='intimidation', selectedSkill=false, skillTemp=false, skillValor=1}", charisma.getIntimidation().toString());
        Assertions.assertEquals("Skill{skillName='persuasion', selectedSkill=false, skillTemp=false, skillValor=1}", charisma.getPersuasion().toString());
    }

    @Test
    public void shouldGetPerformance(){
        Assertions.assertNotNull(charisma.getPerformance());
    }

    @Test
    public void shouldGetDeception(){
        Assertions.assertNotNull(charisma.getDeception());
    }

    @Test
    public void shouldGetIntimidation(){
        Assertions.assertNotNull(charisma.getIntimidation());
    }

    @Test
    public void shouldGetPersuasion(){
        Assertions.assertNotNull(charisma.getPersuasion());
    }

    @Test
    public void shouldSetAbilitySkillsValor(){
        Assertions.assertEquals(6, charisma.getPerformance().getSkillValor());
        Assertions.assertEquals(6, charisma.getDeception().getSkillValor());
        Assertions.assertEquals(1, charisma.getIntimidation().getSkillValor());
        Assertions.assertEquals(1, charisma.getPersuasion().getSkillValor());

        charisma.setAbilitySkillsValor(7);

        Assertions.assertEquals(8, charisma.getPerformance().getSkillValor());
        Assertions.assertEquals(8, charisma.getDeception().getSkillValor());
        Assertions.assertEquals(1, charisma.getIntimidation().getSkillValor());
        Assertions.assertEquals(1, charisma.getPersuasion().getSkillValor());
    }
}
