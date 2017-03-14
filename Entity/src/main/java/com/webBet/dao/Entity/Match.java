package com.webBet.dao.Entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "match")
public class Match {
    private int matchId;
    private double coeffWin;
    private double coeffDraw;
    private double coeffLoss;
    private int matchResult;

    private Set<Team> team = new HashSet<Team>();
    private User user;


    @ManyToMany
    @JoinTable(name = "user_match",
            joinColumns = @JoinColumn(name = "id_match"),
            inverseJoinColumns = @JoinColumn(name = "id_user"))
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @OneToMany (fetch = FetchType.LAZY, mappedBy = "match")
    public Set<Team> getTeam() {
        return team;
    }

    public void setTeam(Set<Team> team) {
        this.team = team;
    }


    public Match() {
    }




    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy="increment")
    @Column(name = "matchId")

    public int getMatchId() {
        return matchId;
    }

    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }

    @Column(name = "coeffWin")

    public double getCoeffWin() {
        return coeffWin;
    }

    public void setCoeffWin(double coeffWin) {
        this.coeffWin = coeffWin;
    }

    @Column(name = "coeffDraw")

    public double getCoeffDraw() {
        return coeffDraw;
    }

    public void setCoeffDraw(double coeffDraw) {
        this.coeffDraw = coeffDraw;
    }

    @Column(name = "coeffLoss")

    public double getCoeffLoss() {
        return coeffLoss;
    }

    public void setCoeffLoss(double coeffLoss) {
        this.coeffLoss = coeffLoss;
    }

    @Column(name = "matchResult")

    public int getMatchResult() {
        return matchResult;
    }

    public void setMatchResult(int matchResult) {
        this.matchResult = matchResult;
    }

    @Override
    public String toString() {
        return "Match{" +
                "matchId='" + matchId + '\'' +
                ", coeffWin='" + coeffWin + '\'' +
                ", coeffDraw='" + coeffDraw + '\'' +
                ", coeffLoss='" + coeffLoss + '\'' +
                ", matchResult='" + matchResult + '\'' +
                ", user='" + user + '\'' +
                '}';
    }

    public Match(double coeffWin, double coeffDraw, double coeffLoss, int matchResult, User user) {
        this.coeffWin = coeffWin;
        this.coeffDraw = coeffDraw;
        this.coeffLoss = coeffLoss;
        this.matchResult = matchResult;
        this.user = user;
    }

    public Match(double coeffWin, double coeffDraw, double coeffLoss, int matchResult) {
        this.coeffWin = coeffWin;
        this.coeffDraw = coeffDraw;
        this.coeffLoss = coeffLoss;
        this.matchResult = matchResult;
    }
}
