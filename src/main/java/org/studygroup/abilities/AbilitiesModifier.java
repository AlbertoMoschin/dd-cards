package org.studygroup.abilities;

public abstract class AbilitiesModifier {

    private final Abilities ability;

    private int points;

    private final boolean savingThrow; // teste de resistencia

    private int savingThrowValor;

    public AbilitiesModifier(Abilities ability, int points, boolean savingThrow, int proficiencyBonus){
        this.ability = ability;
        this.points = points;
        this.savingThrow = savingThrow;
        this.savingThrowValor = getAbilitySkillValor(savingThrow, proficiencyBonus);
    }

    public Abilities getAbility() {
        return ability;
    }

    public void addPoints(int points){
        this.points = this.points + points;
    }

    public int getPoints() {
        return points;
    }

    public boolean isSavingThrow() {
        return savingThrow;
    }

    public int getSavingThrowValor() {
        return savingThrowValor;
    }

    public int getModifier(){
        return Math.floorDiv((this.points - 10), 2);
    }

    public void setSavingThrowValor(int proficiencyBonus) {
        this.savingThrowValor = getAbilitySkillValor(isSavingThrow(), proficiencyBonus);
    }

    public abstract void setAbilitySkillsValor(int proficiencyBonus);

    public int getAbilitySkillValor(boolean selectedSkill, int proficiencyBonus) {
        return selectedSkill? getModifier() + proficiencyBonus : getModifier();
    }
}
