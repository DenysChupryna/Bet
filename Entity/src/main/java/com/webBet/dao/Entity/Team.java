package com.webBet.dao.Entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "team")
public class Team {
    private int teamId;
    private String teamName;
    private double teamRate;

    private Set<Match> match = new HashSet<Match>();

    public Team() {
    }

    public Team(String teamName, double teamRate, Set<Match> match) {
        this.teamName = teamName;
        this.teamRate = teamRate;
        this.match = match;
    }

    public Team(String teamName, double teamRate) {
        this.teamName = teamName;
        this.teamRate = teamRate;
    }

    @ManyToOne
    @JoinColumn (name = "matchId")
    public Set<Match> getMatch() {
        return match;
    }

    public void setMatch(Set<Match> match) {
        this.match = match;
    }

    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy="increment")
    @Column(name = "teamId")

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    @Column(name = "teamName")

    public String getName() {
        return teamName;
    }

    public void setName(String name) {
        this.teamName = name;
    }

    @Column(name = "teamRate")

    public double getTeamRate() {
        return teamRate;
    }

    public void setTeamRate(double teamRate) {
        this.teamRate = teamRate;
    }


    @Override
    public String toString() {
        return "Team{" +
                "teamId=" + teamId + '\'' +
                ", teamName=" + teamName + '\'' +
                ", teamRate=" + teamRate + '\'' +
                ", match=" + match + '\'' +
                '}';
    }
}
