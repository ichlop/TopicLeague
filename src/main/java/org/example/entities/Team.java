package org.example.entities;

public class Team {

    Long id;
    String name;
    Integer totalPoints;
    Integer totalGoalsAcc;
    Integer totalGoalsRec;

    public Team(Long id, String name, Integer totalPoints, Integer totalGoalsAcc, Integer totalGoalsRec) {
        this.id = id;
        this.name = name;
        this.totalPoints = totalPoints;
        this.totalGoalsAcc = totalGoalsAcc;
        this.totalGoalsRec = totalGoalsRec;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(Integer totalPoints) {
        this.totalPoints = totalPoints;
    }

    public Integer getTotalGoalsAcc() {
        return totalGoalsAcc;
    }

    public void setTotalGoalsAcc(Integer totalGoalsAcc) {
        this.totalGoalsAcc = totalGoalsAcc;
    }

    public Integer getTotalGoalsRec() {
        return totalGoalsRec;
    }

    public void setTotalGoalsRec(Integer totalGoalsRec) {
        this.totalGoalsRec = totalGoalsRec;
    }
}
