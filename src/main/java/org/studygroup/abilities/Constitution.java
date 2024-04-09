package org.studygroup.abilities;

public class Constitution extends AbilitiesModifier{

    public Constitution(int points, boolean savingThrow, int proficiencyBonus) {
        super(Abilities.CONSTITUTION, points, savingThrow, proficiencyBonus);
        setAbilitySkillsValor(proficiencyBonus);
    }

    @Override
    public void setAbilitySkillsValor(int proficiencyBonus) {
        //TODO: Log informando que não há skills
    }

    @Override
    public String toString() {
        return "Constitution{" +
                " ability=" + getAbility() +
                ", points=" + getPoints() +
                ", saving throw=" + isSavingThrow() +
                ", saving throw valor=" + getSavingThrowValor() +
                '}';
    }
}
