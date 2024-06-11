package org.studygroup.abilities;

public class Wisdom extends AbilitiesModifier {

    private final Skill insight;

    private final Skill animalHandling;

    private final Skill medicine;

    private final Skill perception;

    private final Skill survival;

    public Wisdom(int points, boolean savingThrow, boolean insight, boolean animalHandling,
                  boolean medicine, boolean perception, boolean survival, int proficiencyBonus) {
        super(Abilities.WISDOM, points, savingThrow, proficiencyBonus);
        this.insight = new Skill(Skills.INSIGHT, insight, false);
        this.animalHandling = new Skill(Skills.ANIMAL_HANDLING, animalHandling, false);
        this.medicine = new Skill(Skills.MEDICINE, medicine, false);
        this.perception = new Skill(Skills.PERCEPTION, perception, false);
        this.survival = new Skill(Skills.SURVIVAL, survival, false);
        setAbilitySkillsValor(proficiencyBonus);
    }

    public Skill getInsight() {
        return insight;
    }

    public Skill getAnimalHandling() {
        return animalHandling;
    }

    public Skill getMedicine() {
        return medicine;
    }

    public Skill getPerception() {
        return perception;
    }

    public Skill getSurvival() {
        return survival;
    }

    @Override
    public void setAbilitySkillsValor(int proficiencyBonus) {
        insight.setSkillValor(getAbilitySkillValor(insight.isSelectedSkill(), proficiencyBonus));
        animalHandling.setSkillValor(getAbilitySkillValor(animalHandling.isSelectedSkill(), proficiencyBonus));
        medicine.setSkillValor(getAbilitySkillValor(medicine.isSelectedSkill(), proficiencyBonus));
        perception.setSkillValor(getAbilitySkillValor(perception.isSelectedSkill(), proficiencyBonus));
        survival.setSkillValor(getAbilitySkillValor(survival.isSelectedSkill(), proficiencyBonus));
    }

    @Override
    public String toString() {
        return "Wisdom{" +
                " ability=" + getAbility() +
                ", points=" + getPoints() +
                ", saving throw=" + isSavingThrow() +
                ", saving throw valor=" + getSavingThrowValor() +
                ", insight=" + insight +
                ", animalHandling=" + animalHandling +
                ", medicine=" + medicine +
                ", perception=" + perception +
                ", survival=" + survival +
                '}';
    }
}
