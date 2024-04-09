package org.studygroup.abilities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.studygroup.TestsConstants.ATHLETICS_TRUE;

public class SkillTests {

    Skill skill;

    @BeforeEach
    public void init(){
        skill = new Skill("athletics", ATHLETICS_TRUE, false);
    }

    @Test
    public void shouldCreateSkill(){
        Assertions.assertEquals("athletics", skill.getSkillName());
        Assertions.assertTrue(skill.isSelectedSkill());
        Assertions.assertFalse(skill.isSkillTemp());
        Assertions.assertEquals(0, skill.getSkillValor());
    }

    @Test
    public void shouldSetAndRevokeSkillTemp(){
        Assertions.assertFalse(skill.isSkillTemp());
        skill.setSkillTemp();
        Assertions.assertTrue(skill.isSkillTemp());
        skill.revokeSkillTemp();
        Assertions.assertFalse(skill.isSkillTemp());
    }

    @Test
    public void ShouldSetSkillValor(){
        Assertions.assertEquals(0, skill.getSkillValor());
        skill.setSkillValor(3);
        Assertions.assertEquals(3, skill.getSkillValor());
    }
}
