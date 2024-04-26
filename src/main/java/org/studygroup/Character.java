package org.studygroup;

public class Character {

    private final String characterName;

    private final String characterClass; // enum?

    private int level;

    private final String background; // (antecedente) descrição livre

    private final String playerName;

    private final String race; // enum?

    private final String alignment; // (tendência) enum?

    private int experiencePoints;

    public Character(String characterName, String characterClass, String background,
                     String playerName, String race, String alignment) {
        this.characterName = characterName;
        this.characterClass = characterClass;
        this.level = 1;
        this.background = background;
        this.playerName = playerName;
        this.race = race;
        this.alignment = alignment;
        this.experiencePoints = 0;
    }

    public String getCharacterName() {
        return characterName;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public int getLevel() {
        return level;
    }

    public void addLevel(){
        level++;
    }

    public String getBackground() {
        return background;
    }

    public String getPlayerName() {
        return playerName;
    }

    public String getRace() {
        return race;
    }

    public String getAlignment() {
        return alignment;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public void addExperiencePoints(int experiencePoints){
        this.experiencePoints = this.experiencePoints + experiencePoints;
    }

    @Override
    public String toString() {
        return "Character{" +
                " characterName='" + characterName + '\'' +
                ", characterClass='" + characterClass + '\'' +
                ", level=" + level +
                ", background='" + background + '\'' +
                ", playerName='" + playerName + '\'' +
                ", race='" + race + '\'' +
                ", alignment='" + alignment + '\'' +
                ", experiencePoints=" + experiencePoints +
                '}';
    }
}
