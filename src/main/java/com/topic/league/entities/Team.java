package com.topic.league.entities;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String email;

    @OneToMany(mappedBy = "team")
    Set<Athlete> teamMember = new HashSet<>();

    public Team(String name, String email) {
        this.name = name;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Athlete> getTeamMember() {
        return teamMember;
    }

    public void setTeamMember(Set<Athlete> teamMember) {
        this.teamMember = teamMember;
    }

    @Override
    public String toString() {
        return name + "{" +
                "παίχτες=" + teamMember +
                '}';
    }
}