package org.studygroup.races;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.studygroup.abilities.Abilities;

public class AasimarTests {

    @Test
    public void shouldCreateAasimar(){
        Aasimar aasimar = new Aasimar(AasimarSubRace.CAIDO, 50, "1,90m 80kg", "celestial", 9, "luz baixa como normal");
        Assertions.assertEquals("Caido",aasimar.getSubRace().getSubRaceName());

        Assertions.assertEquals(2, aasimar.getAbilities().size());
        Assertions.assertEquals(2, aasimar.getAbilities().get(Abilities.CHARISMA));
        Assertions.assertEquals(1, aasimar.getAbilities().get(Abilities.STRENGTH));

        Assertions.assertEquals(4, aasimar.getRacialTraits().size());
    }
}
