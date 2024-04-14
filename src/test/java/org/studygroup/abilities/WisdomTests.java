package org.studygroup.abilities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.studygroup.TestsConstants.*;

public class WisdomTests {

    Wisdom wisdom;

    @BeforeEach
    public void init(){
        wisdom = new Wisdom(POINTS_12, SAVING_THROW_TRUE, INSIGHT_FALSE, ANIMAL_HANDLING_FALSE, MEDICINE_TRUE, PERCEPTION_TRUE, SURVIVAL_TRUE, PROFICIENCY_BONUS_5);
    }

    @Test
    public void shouldCreateWisdom(){
        Assertions.assertEquals(Abilities.WISDOM, wisdom.getAbility());
        Assertions.assertEquals(12, wisdom.getPoints());
        Assertions.assertTrue(wisdom.isSavingThrow());
        Assertions.assertEquals(6, wisdom.getSavingThrowValor());
        Assertions.assertEquals("Skill{skillName='insight', selectedSkill=false, skillTemp=false, skillValor=1}", wisdom.getInsight().toString());
        Assertions.assertEquals("Skill{skillName='animalHandling', selectedSkill=false, skillTemp=false, skillValor=1}", wisdom.getAnimalHandling().toString());
        Assertions.assertEquals("Skill{skillName='medicine', selectedSkill=true, skillTemp=false, skillValor=6}", wisdom.getMedicine().toString());
        Assertions.assertEquals("Skill{skillName='perception', selectedSkill=true, skillTemp=false, skillValor=6}", wisdom.getPerception().toString());
        Assertions.assertEquals("Skill{skillName='survival', selectedSkill=true, skillTemp=false, skillValor=6}", wisdom.getSurvival().toString());
    }

    @Test
    public void shouldGetInsight(){
        Assertions.assertNotNull(wisdom.getInsight());
    }

    @Test
    public void shouldGetAnimalHandling(){
        Assertions.assertNotNull(wisdom.getAnimalHandling());
    }

    @Test
    public void shouldGetMedicine(){
        Assertions.assertNotNull(wisdom.getMedicine());
    }

    @Test
    public void shouldGetPerception(){
        Assertions.assertNotNull(wisdom.getPerception());
    }

    @Test
    public void shouldGetSurvival(){
        Assertions.assertNotNull(wisdom.getSurvival());
    }

    @Test
    public void shouldSetAbilitySkillsValor(){
        Assertions.assertEquals(1, wisdom.getInsight().getSkillValor());
        Assertions.assertEquals(1, wisdom.getAnimalHandling().getSkillValor());
        Assertions.assertEquals(6, wisdom.getMedicine().getSkillValor());
        Assertions.assertEquals(6, wisdom.getPerception().getSkillValor());
        Assertions.assertEquals(6, wisdom.getSurvival().getSkillValor());

        wisdom.setAbilitySkillsValor(8);

        Assertions.assertEquals(1, wisdom.getInsight().getSkillValor());
        Assertions.assertEquals(1, wisdom.getAnimalHandling().getSkillValor());
        Assertions.assertEquals(9, wisdom.getMedicine().getSkillValor());
        Assertions.assertEquals(9, wisdom.getPerception().getSkillValor());
        Assertions.assertEquals(9, wisdom.getSurvival().getSkillValor());
    }
}
