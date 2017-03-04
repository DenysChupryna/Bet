package com.webBet.dao.interfaces;


import com.webBet.dao.Entity.Match;

import java.sql.SQLException;

public interface MatchDAO {
    public void addMatch(Match match) throws SQLException;
    public void deleteMatch(Match match) throws SQLException;
    public void updateMatch(Match match) throws SQLException;
}
