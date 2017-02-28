package com.webBet.dao.interfaces;

import com.webBet.dao.Entity.User;

import java.sql.SQLException;

public interface UserDAO {

    public void addUser(User user) throws SQLException;
    public void updateUser(User user) throws SQLException;
    public User getUserByName(String name) throws SQLException;
    public void deleteUser(User user) throws SQLException;
    public Integer getUserIdByName(String name) throws SQLException;
    public User getUserById(int id)throws SQLException;
}
