package org.studygroup.abilities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.studygroup.TestsConstants.*;

public class ConstitutionTests {

    Constitution constitution;

    @BeforeEach
    public void init(){
        constitution = new Constitution(POINTS_12, SAVING_THROW_TRUE, PROFICIENCY_BONUS_5);
    }

    @Test
    public void shouldCreateConstitution(){
        Assertions.assertEquals(Abilities.CONSTITUTION, constitution.getAbility());
        Assertions.assertEquals(12, constitution.getPoints());
        Assertions.assertTrue(constitution.isSavingThrow());
        Assertions.assertEquals(6, constitution.getSavingThrowValor());
    }

    @Test
    public void shouldAddPoints(){
        constitution.addPoints(2);
        Assertions.assertEquals(14, constitution.getPoints());
    }
}
