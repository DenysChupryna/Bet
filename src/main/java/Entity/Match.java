package Entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Денис on 14.02.2017.
 */
@Entity
@Table(name = "match")
public class Match {
    private double coeffWin;
    private double coeffDraw;
    private double coeffLoss;
    private int matchResult;


    public Match() {
}
