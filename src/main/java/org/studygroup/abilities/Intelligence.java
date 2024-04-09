package org.studygroup.abilities;

public class Intelligence extends AbilitiesModifier{

    private Skill arcana;

    private Skill history;

    private Skill investigation;

    private Skill nature;

    private Skill religion;
    public Intelligence(int points, boolean savingThrow, boolean arcana, boolean history,
                        boolean investigation, boolean nature, boolean religion, int proficiencyBonus) {
        super(Abilities.INTELLIGENCE, points, savingThrow, proficiencyBonus);
        this.arcana = new Skill("arcana", arcana, false);
        this.history = new Skill("history", history, false);
        this.investigation = new Skill("investigation", investigation, false);
        this.nature = new Skill("nature", nature, false);
        this.religion = new Skill("religion", religion, false);
        setAbilitySkillsValor(proficiencyBonus);
    }

    public Skill getArcana() {
        return arcana;
    }

    public Skill getHistory() {
        return history;
    }

    public Skill getInvestigation() {
        return investigation;
    }

    public Skill getNature() {
        return nature;
    }

    public Skill getReligion() {
        return religion;
    }

    @Override
    public void setAbilitySkillsValor(int proficiencyBonus) {
        arcana.setSkillValor(getAbilitySkillValor(arcana.isSelectedSkill(), proficiencyBonus));
        history.setSkillValor(getAbilitySkillValor(history.isSelectedSkill(), proficiencyBonus));
        investigation.setSkillValor(getAbilitySkillValor(investigation.isSelectedSkill(), proficiencyBonus));
        nature.setSkillValor(getAbilitySkillValor(nature.isSelectedSkill(), proficiencyBonus));
        religion.setSkillValor(getAbilitySkillValor(religion.isSelectedSkill(), proficiencyBonus));
    }

    @Override
    public String toString() {
        return "Intelligence{" +
                " ability=" + getAbility() +
                ", points=" + getPoints() +
                ", saving throw=" + isSavingThrow() +
                ", saving throw valor=" + getSavingThrowValor() +
                ", arcana=" + arcana +
                ", history=" + history +
                ", investigation=" + investigation +
                ", nature=" + nature +
                ", religion=" + religion +
                '}';
    }
}
