package org.studygroup.races;

import org.studygroup.abilities.Abilities;

import java.util.HashMap;

public class Aasimar extends Race {

    private AasimarSubRace subRace;

    public Aasimar(AasimarSubRace subRace, int age, String sizeAndWeight) {
        this(subRace, Alignment.GOOD, age, sizeAndWeight);
    }

    public Aasimar(AasimarSubRace subRace, Alignment alignment, int age, String sizeAndWeight) {
        super(alignment, age, sizeAndWeight, "Celestial e Comum", Speed.DEFAULT, DarkVision.DEFAULT_SUPERIOR);
        this.subRace = subRace;
        this.setAbilities(subRace.getAbilities());
        this.setRacialTraits(subRace.getSubRacialTraits());
    }

    public AasimarSubRace getSubRace() {
        return subRace;
    }

    public void setAbilities(HashMap<Abilities, Integer> abilities) {
        abilities.put(Abilities.CHARISMA, 2);
        super.setAbilities(abilities);
    }

    public void setRacialTraits(HashMap<String, String> racialTraits) {
        racialTraits.put("Mãos que Curam", "Uma vez por dia com uma ação cura alvo tocado PA igual à seu nível");
        racialTraits.put("Portador da Luz", "Conhece o Truque Luz");
        racialTraits.put("Resistência Celestial", "Resistência à dano Necrótico e Radiante");
        super.setRacialTraits(racialTraits);
    }

}
