package org.studygroup.abilities;

public class Skill {

    private final String skillName;

    private final boolean selectedSkill;

    private boolean skillTemp;

    private int skillValor;

    public Skill(String skillName, boolean skill, boolean skillTemp) {
        this.skillName = skillName;
        this.selectedSkill = skill;
        this.skillTemp = skillTemp;
    }

    public String getSkillName() {
        return skillName;
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
                "skillName='" + skillName + '\'' +
                ", selectedSkill=" + selectedSkill +
                ", skillTemp=" + skillTemp +
                ", skillValor=" + skillValor +
                '}';
    }
}
