package com.webBet.dao.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "match")
public class Match {
    private int matchId;
    private double coeffWin;
    private double coeffDraw;
    private double coeffLoss;
    private int matchResult;


    public Match() {
    }

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
}
