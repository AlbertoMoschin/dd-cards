package org.studygroup.races;

import org.studygroup.abilities.Abilities;

import java.util.HashMap;
import java.util.Map;

public abstract class Race {

    private HashMap<Abilities, Integer> abilities;

    private Alignment alignment;

    private int age; //TODO: descrição ou idade de fato?

    private String sizeAndWeight; //TODO: padronizar?

    private String language;

    private Speed speed; // TODO: elfo silvestre

    private DarkVision darkVision; // TODO: subraça de anão, elfo e gnomo

    private HashMap<String, String> racialTraits;

    public Race(Alignment alignment, int age, String sizeAndWeight, String language) {
        this.alignment = alignment;
        this.age = age;
        this.sizeAndWeight = sizeAndWeight;
        this.language = language;
    }

    public Race(Alignment alignment, int age, String sizeAndWeight, String language, Speed speed, DarkVision darkVision) {
        this.alignment = alignment;
        this.age = age;
        this.sizeAndWeight = sizeAndWeight;
        this.language = language;
        this.speed = speed;
        this.darkVision = darkVision;
    }

    public void setAbilities(HashMap<Abilities, Integer> abilities) {
        this.abilities = abilities;
    }

    public Map<Abilities, Integer> getAbilities() {
        return abilities;
    }

    public Alignment getAlignment() {
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

    void setSpeed(Speed speed) {
        this.speed = speed;
    }

    public Speed getSpeed() {
        return speed;
    }

    void setDarkVision(DarkVision darkVision) {
        this.darkVision = darkVision;
    }

    public DarkVision getDarkVision() {
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
                ", speed='" + speed.getSpeed() + '\'' +
                ", darkVision='" + darkVision.getDarkVision() + '\'' +
                ", racialTraits=" + racialTraits +
                '}';
    }
}
