package org.studygroup;

import org.studygroup.abilities.*;

public class CharacterLoad {

    private Inspiration inspiration = Inspiration.REMOVE;

    private int proficiencyBonus;

    private Character character;

    private Strength strength;

    private Dexterity dexterity;

    private Constitution constitution;

    private Intelligence intelligence;

    private Wisdom wisdom;

    private Charisma charisma;

    public CharacterLoad(int proficiencyBonus, Character character, Strength strength, Dexterity dexterity,
                         Constitution constitution, Intelligence intelligence, Wisdom wisdom, Charisma charisma) {
        this.proficiencyBonus = proficiencyBonus;
        this.character = character;
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
    }

    public void setInspiration(){
        this.inspiration = Inspiration.ADD;
    }

    public void removeInspiration(){
        this.inspiration = Inspiration.REMOVE;
    }

    public int getInspiration(){
        return inspiration.getInspiration();
    }
    
    public void addProficiencyBonus(){
        proficiencyBonus++; //TODO: validar lógica para soma
        setAllAbilitiesSavingThrowValor();
        setAllAbilitiesSkillsValor();
    }

    public int getProficiencyBonus(){
        return proficiencyBonus;
    }

    public Character getCharacter() {
        return character;
    }

    public Strength getStrength() {
        return strength;
    }

    public Dexterity getDexterity() {
        return dexterity;
    }

    public Constitution getConstitution() {
        return constitution;
    }

    public Intelligence getIntelligence() {
        return intelligence;
    }

    public Wisdom getWisdom() {
        return wisdom;
    }

    public Charisma getCharisma() {
        return charisma;
    }

    private void setAllAbilitiesSavingThrowValor() {
        strength.setSavingThrowValor(getProficiencyBonus());
        dexterity.setSavingThrowValor(getProficiencyBonus());
        constitution.setSavingThrowValor(getProficiencyBonus());
        intelligence.setSavingThrowValor(getProficiencyBonus());
        wisdom.setSavingThrowValor(getProficiencyBonus());
        charisma.setSavingThrowValor(getProficiencyBonus());
    }

    private void setAllAbilitiesSkillsValor(){
        strength.setAbilitySkillsValor(getProficiencyBonus());
        dexterity.setAbilitySkillsValor(getProficiencyBonus());
        constitution.setAbilitySkillsValor(getProficiencyBonus());
        intelligence.setAbilitySkillsValor(getProficiencyBonus());
        wisdom.setAbilitySkillsValor(getProficiencyBonus());
        charisma.setAbilitySkillsValor(getProficiencyBonus());
    }

}
