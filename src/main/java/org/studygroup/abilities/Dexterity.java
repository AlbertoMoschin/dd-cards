package org.studygroup.abilities;

public class Dexterity extends AbilitiesModifier{

    private Skill acrobatics;

    private Skill stealth;

    private Skill sleightOfHand;

    public Dexterity(int points, boolean savingThrow, boolean acrobatics, boolean stealth, boolean sleightOfHand, int proficiencyBonus) {
        super(Abilities.DEXTERITY, points, savingThrow, proficiencyBonus);
        this.acrobatics = new Skill("acrobatics", acrobatics, false);
        this.stealth = new Skill("stealth", stealth, false);
        this.sleightOfHand = new Skill("sleightOfHand", sleightOfHand, false);
        setAbilitySkillsValor(proficiencyBonus);
    }

    public Skill getAcrobatics() {
        return acrobatics;
    }

    public Skill getStealth() {
        return stealth;
    }

    public Skill getSleightOfHand() {
        return sleightOfHand;
    }

    @Override
    public void setAbilitySkillsValor(int proficiencyBonus) {
        acrobatics.setSkillValor(getAbilitySkillValor(acrobatics.isSelectedSkill(), proficiencyBonus));
        stealth.setSkillValor(getAbilitySkillValor(stealth.isSelectedSkill(), proficiencyBonus));
        sleightOfHand.setSkillValor(getAbilitySkillValor(sleightOfHand.isSelectedSkill(), proficiencyBonus));
    }

    @Override
    public String toString() {
        return "Dexterity{" +
                " ability=" + getAbility() +
                ", points=" + getPoints() +
                ", saving throw=" + isSavingThrow() +
                ", saving throw valor=" + getSavingThrowValor() +
                ", acrobatics=" + acrobatics +
                ", stealth=" + stealth +
                ", sleightOfHand=" + sleightOfHand +
                '}';
    }

}
