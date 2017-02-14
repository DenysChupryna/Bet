package Entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Денис on 14.02.2017.
 */
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
