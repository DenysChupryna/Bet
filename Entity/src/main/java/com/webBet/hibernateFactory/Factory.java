package com.webBet.hibernateFactory;

import com.webBet.dao.implement.MatchDAOimpl;
import com.webBet.dao.implement.TeamDAOimpl;
import com.webBet.dao.implement.UserDAOimpl;
import com.webBet.dao.interfaces.MatchInterface;
import com.webBet.dao.interfaces.TeamInterface;
import com.webBet.dao.interfaces.UserInterface;

/**
 * Created by Анна on 25.02.2017.
 */
public class Factory {

    private static UserInterface userInterface = null;
    private static MatchInterface matchInterface = null;
    private static TeamInterface teamInterface = null;
    private static Factory instance = null;

    public static synchronized Factory getInstance() {
        if (instance == null) {
            instance = new Factory();
        }
        return instance;
    }

    public UserInterface getUserInterface() {
        if (userInterface == null) {
            userInterface = new UserDAOimpl();

        }
        return userInterface;
    }
    public MatchInterface getMatchInterface() {
        if (matchInterface == null) {
            matchInterface = new MatchDAOimpl();
        }
        return matchInterface;
    }
    public TeamInterface getTeamInterface() {
        if (teamInterface == null) {
            teamInterface = new TeamDAOimpl();
        }
        return teamInterface;
    }





}
