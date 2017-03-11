package com.webBet.dao.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Денис on 14.02.2017.
 */
@Entity
@Table(name = "team")
public class Team {
    private int teamId;
    private String teamName;
    private int idTeam;
    private double teamRate;

    public Team() {
    }

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
}
