package org.studygroup.abilities;

public class Strength extends AbilitiesModifier{

    private Skill athletics;

    public Strength(int points, boolean savingThrow, boolean athletics, int proficiencyBonus) {
        super(Abilities.STRENGTH, points, savingThrow, proficiencyBonus);
        this.athletics = new Skill("athletics", athletics, false);
        setAbilitySkillsValor(proficiencyBonus);
    }

    public Skill getAthletics() {
        return athletics;
    }

    @Override
    public void setAbilitySkillsValor(int proficiencyBonus) {
        athletics.setSkillValor(getAbilitySkillValor(athletics.isSelectedSkill(), proficiencyBonus));
    }

    @Override
    public String toString() {
        return "Strength{" +
                " ability=" + getAbility() +
                ", points=" + getPoints() +
                ", saving throw=" + isSavingThrow() +
                ", saving throw valor=" + getSavingThrowValor() +
                ", athletics=" + athletics +
                '}';
    }
}
