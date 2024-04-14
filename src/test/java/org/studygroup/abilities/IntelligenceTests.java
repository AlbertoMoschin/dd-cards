package org.studygroup.abilities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.studygroup.TestsConstants.*;

public class IntelligenceTests {

    Intelligence intelligence;

    @BeforeEach
    public void init(){
        intelligence = new Intelligence(POINTS_12, SAVING_THROW_TRUE, ARCANA_TRUE, HISTORY_TRUE, INVESTIGATION_FALSE, NATURE_FALSE, RELIGION_TRUE, PROFICIENCY_BONUS_5);
    }

    @Test
    public void shouldCreateIntelligence(){
        Assertions.assertEquals(Abilities.INTELLIGENCE, intelligence.getAbility());
        Assertions.assertEquals(12, intelligence.getPoints());
        Assertions.assertTrue(intelligence.isSavingThrow());
        Assertions.assertEquals(6, intelligence.getSavingThrowValor());
        Assertions.assertEquals("Skill{skillName='arcana', selectedSkill=true, skillTemp=false, skillValor=6}", intelligence.getArcana().toString());
        Assertions.assertEquals("Skill{skillName='history', selectedSkill=true, skillTemp=false, skillValor=6}", intelligence.getHistory().toString());
        Assertions.assertEquals("Skill{skillName='investigation', selectedSkill=false, skillTemp=false, skillValor=1}", intelligence.getInvestigation().toString());
        Assertions.assertEquals("Skill{skillName='nature', selectedSkill=false, skillTemp=false, skillValor=1}", intelligence.getNature().toString());
        Assertions.assertEquals("Skill{skillName='religion', selectedSkill=true, skillTemp=false, skillValor=6}", intelligence.getReligion().toString());
    }

    @Test
    public void shouldGetArcana(){
        Assertions.assertNotNull(intelligence.getArcana());
    }

    @Test
    public void shouldGetHistory(){
        Assertions.assertNotNull(intelligence.getHistory());
    }

    @Test
    public void shouldGetInvestigation(){
        Assertions.assertNotNull(intelligence.getInvestigation());
    }

    @Test
    public void shouldGetNature(){
        Assertions.assertNotNull(intelligence.getNature());
    }

    @Test
    public void shouldGetReligion(){
        Assertions.assertNotNull(intelligence.getReligion());
    }

    @Test
    public void shouldSetAbilitySkillsValor(){
        Assertions.assertEquals(6, intelligence.getArcana().getSkillValor());
        Assertions.assertEquals(6, intelligence.getHistory().getSkillValor());
        Assertions.assertEquals(1, intelligence.getInvestigation().getSkillValor());
        Assertions.assertEquals(1, intelligence.getNature().getSkillValor());
        Assertions.assertEquals(6, intelligence.getReligion().getSkillValor());

        intelligence.setAbilitySkillsValor(7);

        Assertions.assertEquals(8, intelligence.getArcana().getSkillValor());
        Assertions.assertEquals(8, intelligence.getHistory().getSkillValor());
        Assertions.assertEquals(1, intelligence.getInvestigation().getSkillValor());
        Assertions.assertEquals(1, intelligence.getNature().getSkillValor());
        Assertions.assertEquals(8, intelligence.getReligion().getSkillValor());
    }
}
