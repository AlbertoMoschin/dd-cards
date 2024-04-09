package org.studygroup;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.studygroup.abilities.*;

import static org.studygroup.TestsConstants.*;

public class CharacterLoadTests {

    Character character;
    Strength strength;
    Dexterity dexterity;
    Constitution constitution;
    Intelligence intelligence;
    Wisdom wisdom;
    Charisma charisma;
    CharacterLoad characterLoad;

    @BeforeEach
    public void init(){
        character = new Character("NOME", "CLASSE", "Pilantra bebedor de chorume", "Yoda", "SRD", "Bebum");
        strength = new Strength(POINTS_12, SAVING_THROW_TRUE, ATHLETICS_TRUE, PROFICIENCY_BONUS_5);
        dexterity = new Dexterity(POINTS_12, SAVING_THROW_FALSE, ACROBATICS_TRUE, STEALTH_FALSE, SLEIGHT_OF_HAND_TRUE, PROFICIENCY_BONUS_5);
        constitution = new Constitution(POINTS_12, SAVING_THROW_TRUE, PROFICIENCY_BONUS_5);
        intelligence = new Intelligence(POINTS_12, SAVING_THROW_TRUE, ARCANA_TRUE, HISTORY_TRUE, INVESTIGATION_FALSE, NATURE_FALSE, RELIGION_TRUE, PROFICIENCY_BONUS_5);
        wisdom = new Wisdom(POINTS_12, SAVING_THROW_FALSE, INSIGHT_FALSE, ANIMAL_HANDLING_FALSE, MEDICINE_TRUE, PERCEPTION_TRUE, SURVIVAL_TRUE, PROFICIENCY_BONUS_5);
        charisma = new Charisma(POINTS_12, SAVING_THROW_TRUE, PERFORMANCE_TRUE, DECEPTION_TRUE, INTIMIDATION_FALSE, PERSUASION_FALSE, PROFICIENCY_BONUS_5);
        characterLoad = new CharacterLoad(PROFICIENCY_BONUS_5, character, strength, dexterity, constitution, intelligence, wisdom, charisma);
    }

    @Test
    public void shouldCreateCharacterSheet(){
        Assertions.assertEquals(PROFICIENCY_BONUS_5, characterLoad.getProficiencyBonus());
        Assertions.assertEquals(0, characterLoad.getInspiration());
        Assertions.assertNotNull(characterLoad.getCharacter());
        Assertions.assertNotNull(characterLoad.getStrength());
        Assertions.assertNotNull(characterLoad.getDexterity());
        Assertions.assertNotNull(characterLoad.getConstitution());
        Assertions.assertNotNull(characterLoad.getIntelligence());
        Assertions.assertNotNull(characterLoad.getWisdom());
        Assertions.assertNotNull(characterLoad.getCharisma());
    }

    @Test
    public void shouldSetInspiration(){
        Assertions.assertEquals(0, characterLoad.getInspiration());
        characterLoad.setInspiration();
        Assertions.assertEquals(1, characterLoad.getInspiration());
    }

    @Test
    public void shouldRemoveInspiration(){
        characterLoad.setInspiration();
        Assertions.assertEquals(1, characterLoad.getInspiration());
        characterLoad.removeInspiration();
        Assertions.assertEquals(0, characterLoad.getInspiration());
    }

    @Test
    public void shouldAddProficiencyBonus(){
        Assertions.assertEquals(PROFICIENCY_BONUS_5, characterLoad.getProficiencyBonus());
        characterLoad.addProficiencyBonus();
        Assertions.assertEquals(6, characterLoad.getProficiencyBonus());
    }

    @Test
    public void shouldSetAllAbilitiesSavingThrowValor(){
        Assertions.assertEquals(6, characterLoad.getStrength().getSavingThrowValor());
        Assertions.assertEquals(1, characterLoad.getDexterity().getSavingThrowValor());
        Assertions.assertEquals(6, characterLoad.getConstitution().getSavingThrowValor());
        Assertions.assertEquals(6, characterLoad.getIntelligence().getSavingThrowValor());
        Assertions.assertEquals(1, characterLoad.getWisdom().getSavingThrowValor());
        Assertions.assertEquals(6, characterLoad.getCharisma().getSavingThrowValor());

        characterLoad.addProficiencyBonus();

        Assertions.assertEquals(7, characterLoad.getStrength().getSavingThrowValor());
        Assertions.assertEquals(1, characterLoad.getDexterity().getSavingThrowValor());
        Assertions.assertEquals(7, characterLoad.getConstitution().getSavingThrowValor());
        Assertions.assertEquals(7, characterLoad.getIntelligence().getSavingThrowValor());
        Assertions.assertEquals(1, characterLoad.getWisdom().getSavingThrowValor());
        Assertions.assertEquals(7, characterLoad.getCharisma().getSavingThrowValor());
    }
}
