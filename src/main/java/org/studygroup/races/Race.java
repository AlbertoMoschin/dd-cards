package org.studygroup.races;

import org.studygroup.abilities.Abilities;

import java.util.HashMap;
import java.util.Map;

public abstract class Race {

    private HashMap<Abilities, Integer> abilities;

    private String alignment; //TODO: padronizar?

    private int age; //TODO: descrição ou idade de fato?

    private String sizeAndWeight; //TODO: padronizar?

    private String language; //TODO: padronizar?

    private int speed; //TODO: padronizar?

    private String darkVision; //TODO: padronizar?

    private HashMap<String, String> racialTraits;

    public Race(String alignment, int age, String sizeAndWeight, String language, String darkVision) {
        this.alignment = alignment;
        this.age = age;
        this.sizeAndWeight = sizeAndWeight;
        this.language = language;
        this.darkVision = darkVision;
    }

    public void setAbilities(HashMap<Abilities, Integer> abilities) {
        this.abilities = abilities;
    }

    public Map<Abilities, Integer> getAbilities() {
        return abilities;
    }

    public String getAlignment() {
        return alignment;
    }

    public int getAge() {
        return age;
    }

    public String getSizeAndWeight() {
        return sizeAndWeight;
    }

    public String getLanguage() {
        return language;
    }

    public int getSpeed() {
        return speed;
    }

    public String getDarkVision() {
        return darkVision;
    }

    public void setRacialTraits(HashMap<String, String> racialTraits) {
        this.racialTraits = racialTraits;
    };

    public HashMap<String, String> getRacialTraits() {
        return racialTraits;
    }

    @Override
    public String toString() {
        return "Race{" +
                "abilities=" + abilities +
                ", alignment='" + alignment + '\'' +
                ", age=" + age +
                ", sizeAndWeight='" + sizeAndWeight + '\'' +
                ", language='" + language + '\'' +
                ", speed='" + speed + '\'' +
                ", darkVision='" + darkVision + '\'' +
                ", racialTraits=" + racialTraits +
                '}';
    }
}
