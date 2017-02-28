package com.webBet.dao.Entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
    private int idUser;
    private String name;
    private String password;
    private double money;

    public User(){

    }


}
