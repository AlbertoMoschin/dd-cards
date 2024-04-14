package org.studygroup.abilities;

public class Charisma extends AbilitiesModifier{

    private final Skill performance;

    private final Skill deception;

    private final Skill intimidation;

    private final Skill persuasion;

    public Charisma(int points, boolean savingThrow, boolean performance,
                    boolean deception, boolean intimidation, boolean persuasion, int proficiencyBonus) {
        super(Abilities.CHARISMA, points, savingThrow, proficiencyBonus);
        this.performance = new Skill(Skills.PERFORMANCE, performance, false);
        this.deception = new Skill(Skills.DECEPTION, deception, false);
        this.intimidation = new Skill(Skills.INTIMIDATION, intimidation, false);
        this.persuasion = new Skill(Skills.PERSUASION, persuasion, false);
        setAbilitySkillsValor(proficiencyBonus);
    }

    public Skill getPerformance() {
        return performance;
    }

    public Skill getDeception() {
        return deception;
    }

    public Skill getIntimidation() {
        return intimidation;
    }

    public Skill getPersuasion() {
        return persuasion;
    }

    @Override
    public void setAbilitySkillsValor(int proficiencyBonus) {
        performance.setSkillValor(getAbilitySkillValor(performance.isSelectedSkill(), proficiencyBonus));
        deception.setSkillValor(getAbilitySkillValor(deception.isSelectedSkill(), proficiencyBonus));
        intimidation.setSkillValor(getAbilitySkillValor(intimidation.isSelectedSkill(), proficiencyBonus));
        persuasion.setSkillValor(getAbilitySkillValor(persuasion.isSelectedSkill(), proficiencyBonus));
    }

    @Override
    public String toString() {
        return "Charisma{" +
                " ability=" + getAbility() +
                ", points=" + getPoints() +
                ", saving throw=" + isSavingThrow() +
                ", saving throw valor=" + getSavingThrowValor() +
                ", performance=" + performance +
                ", deception=" + deception +
                ", intimidation=" + intimidation +
                ", persuasion=" + persuasion +
                '}';
    }
}
