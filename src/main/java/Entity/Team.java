package Entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Денис on 14.02.2017.
 */
@Entity
@Table(name = "team")
public class Team {
    private String name;
    private int idTeam;
    private double teamRate;

    public Team() {
    }
}
