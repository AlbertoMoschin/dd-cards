package org.studygroup.abilities;

public enum Skills {
    ATHLETICS("athletics"),
    ACROBATICS("acrobatics"),
    STEALTH("stealth"),
    SLEIGHT_OF_HAND("sleightOfHand"),
    ARCANA("arcana"),
    HISTORY("history"),
    INVESTIGATION("investigation"),
    NATURE("nature"),
    RELIGION("religion"),
    INSIGHT("insight"),
    ANIMAL_HANDLING("animalHandling"),
    MEDICINE("medicine"),
    PERCEPTION("perception"),
    SURVIVAL("survival"),
    PERFORMANCE("performance"),
    DECEPTION("deception"),
    INTIMIDATION("intimidation"),
    PERSUASION("persuasion");

    private final String skillName;

    Skills(String skillName) {
        this.skillName = skillName;
    }

    public String getSkillName() {
        return skillName;
    }
}
