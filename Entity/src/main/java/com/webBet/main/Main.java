package com.webBet.main;

import com.webBet.dao.Entity.Match;
import com.webBet.dao.Entity.Team;
import com.webBet.dao.Entity.User;
import com.webBet.hibernateFactory.Factory;

import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws SQLException{

        User u1 = new User("Denys","0000",1000);
        Team Juve = new Team("Juventus",1);
        Team Napoli = new Team("Napoli",2);
        Set<Team> team1 = new HashSet<Team>();
        team1.add(Juve);
        team1.add(Napoli);
        Match match1 = new Match(1.7, 3.1, 4.2, 1);

        Factory.getInstance().getUserDAO().addUser(u1);
        Factory.getInstance().getTeamDAO().addTeam(Juve);
        Factory.getInstance().getTeamDAO().addTeam(Napoli);
        Factory.getInstance().getMatchDAO().addMatch(match1);


    }
}
