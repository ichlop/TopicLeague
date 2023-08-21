package org.example.entities;

public class Athlete {

    Long id;
    String fName;
    String lName;
    String teamMember;
    Integer goalScored;
    Integer redCard;

    public Athlete(Long id, String fName, String lName, String teamMember, Integer goalScored, Integer redCard) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.teamMember = teamMember;
        this.goalScored = goalScored;
        this.redCard = redCard;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getTeamMember() {
        return teamMember;
    }

    public void setTeamMember(String teamMember) {
        this.teamMember = teamMember;
    }

    public Integer getGoalScored() {
        return goalScored;
    }

    public void setGoalScored(Integer goalScored) {
        this.goalScored = goalScored;
    }

    public Integer getRedCard() {
        return redCard;
    }

    public void setRedCard(Integer redCard) {
        this.redCard = redCard;
    }

    @Override
    public String toString() {
        return fName + " " + lName  +
                " from " + teamMember +
                " has scored " + goalScored +
                " and has receive " + redCard +
                " red cards.";
    }
}
