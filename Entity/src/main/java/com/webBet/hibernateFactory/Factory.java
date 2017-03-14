package com.webBet.hibernateFactory;

import com.webBet.dao.implement.MatchDAOimpl;
import com.webBet.dao.implement.TeamDAOimpl;
import com.webBet.dao.implement.UserDAOimpl;
import com.webBet.dao.interfaces.MatchDAO;
import com.webBet.dao.interfaces.TeamDAO;
import com.webBet.dao.interfaces.UserDAO;

public class Factory {

    private static UserDAO userDAO = null;
    private static MatchDAO matchDAO = null;
    private static TeamDAO teamDAO = null;
    private static Factory instance = null;

    public static synchronized Factory getInstance() {
        if (instance == null) {
            instance = new Factory();
        }
        return instance;
    }

    public UserDAO getUserDAO() {
        if (userDAO == null) {
            userDAO = new UserDAOimpl();
        }
        return userDAO;
    }
    public MatchDAO getMatchDAO() {
        if (matchDAO == null) {
            matchDAO = new MatchDAOimpl();
        }
        return matchDAO;
    }
    public TeamDAO getTeamDAO() {
        if (teamDAO == null) {
            teamDAO = new TeamDAOimpl();
        }
        return teamDAO;
    }





}
