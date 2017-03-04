package com.webBet.dao.interfaces;

import com.webBet.dao.Entity.Team;

import java.sql.SQLException;

public interface TeamDAO {
    public void addTeam(Team team) throws SQLException;
    public void deleteTeam(Team team) throws SQLException;
    public void updateTeam(Team team) throws SQLException;
}
