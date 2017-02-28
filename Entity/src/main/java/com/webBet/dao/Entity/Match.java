package com.webBet.dao.Entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "match")
public class Match {
    private double coeffWin;
    private double coeffDraw;
    private double coeffLoss;
    private int matchResult;


    public Match() {
    }
}
