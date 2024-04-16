package org.studygroup.abilities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.studygroup.TestsConstants.*;

public class ConstitutionTests {

    @Test
    public void shouldCreateConstitution(){
        Constitution constitution = new Constitution(POINTS_12, SAVING_THROW_TRUE, PROFICIENCY_BONUS_5);
        Assertions.assertEquals(Abilities.CONSTITUTION, constitution.getAbility());
        Assertions.assertEquals(12, constitution.getPoints());
        Assertions.assertTrue(constitution.isSavingThrow());
        Assertions.assertEquals(6, constitution.getSavingThrowValor());
    }

    @Test
    public void shouldAddPoints(){
        Constitution constitution = new Constitution(POINTS_12, SAVING_THROW_TRUE, PROFICIENCY_BONUS_5);
        constitution.addPoints(2);
        Assertions.assertEquals(14, constitution.getPoints());
    }

    @Test
    public void shouldTestAllModifiersValues(){
        Constitution constitution = new Constitution(POINTS_1, SAVING_THROW_FALSE, PROFICIENCY_BONUS_5);

        int points = 1;
        int expectedModifier = -5;
        while(points <= 30){
            Assertions.assertEquals(points, constitution.getPoints());
            if((points % 2) == 0) expectedModifier++;
            Assertions.assertEquals(expectedModifier, constitution.getModifier());
            constitution.addPoints(1);
            points++;
        }
    }

}
