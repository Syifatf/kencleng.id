package syifa.app.kcid.entity;

import java.io.PrintStream;
import java.io.Serializable;

/**
 * Created by USER on 06/01/2019.
 */

public class Kencleng implements Serializable {

    private int id;
    private int nominal;
    private String catatan;
    private static String kencleng;

    public static String getKencleng() {
        return kencleng;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public void setCatatan(String catatan) {
        this.catatan = catatan;
    }

    public int getId() {
        return id;
    }

    public int getNominal() {
        return nominal;
    }

    public String getCatatan() {
        return catatan;
    }
}
