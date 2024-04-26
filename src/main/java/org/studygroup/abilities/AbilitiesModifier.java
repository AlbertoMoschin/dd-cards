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
        setSavingThrowValor(proficiencyBonus);
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

    public final int getModifier(){
        return Math.floorDiv((this.points - 10), 2);
    }

    public final void setSavingThrowValor(int proficiencyBonus) {
        this.savingThrowValor = getAbilitySkillValor(isSavingThrow(), proficiencyBonus);
    }

    public abstract void setAbilitySkillsValor(int proficiencyBonus);

    public final int getAbilitySkillValor(boolean selectedSkill, int proficiencyBonus) {
        return selectedSkill? getModifier() + proficiencyBonus : getModifier();
    }
}
