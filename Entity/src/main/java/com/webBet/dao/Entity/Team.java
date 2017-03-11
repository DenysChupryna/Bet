package com.webBet.dao.Entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by Денис on 14.02.2017.
 */
@Entity
@Table(name = "team")
public class Team {
    private int teamId;
    private String teamName;
    private double teamRate;

    public Team() {
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
}
