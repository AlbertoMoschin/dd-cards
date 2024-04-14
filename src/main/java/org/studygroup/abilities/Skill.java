package org.studygroup.abilities;

public class Skill {

    private final Skills skills;

    private final boolean selectedSkill;

    private boolean skillTemp;

    private int skillValor;

    public Skill(Skills skills, boolean skill, boolean skillTemp) {
        this.skills = skills;
        this.selectedSkill = skill;
        this.skillTemp = skillTemp;
    }

    public String getSkills() {
        return skills.getSkillName();
    }

    public boolean isSelectedSkill() {
        return selectedSkill;
    }

    public boolean isSkillTemp() {
        return skillTemp;
    }

    public void setSkillTemp() {
        this.skillTemp = Boolean.TRUE;
    }

    public void revokeSkillTemp() {
        this.skillTemp = Boolean.FALSE;
    }

    public int getSkillValor() {
        return skillValor;
    }

    public void setSkillValor(int skillValor) {
        this.skillValor = skillValor;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "skillName='" + skills.getSkillName() + '\'' +
                ", selectedSkill=" + selectedSkill +
                ", skillTemp=" + skillTemp +
                ", skillValor=" + skillValor +
                '}';
    }
}
