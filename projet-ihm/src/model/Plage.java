
package model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author G47575
 */
public class Plage implements Serializable {

    private String date;
    private String heure;

    public Plage(String date, String heure) {
        this.date = date;
        this.heure = heure;
    }

    public String getDate() {
        return date;
    }

    public String getHeure() {
        return heure;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.date);
        hash = 59 * hash + Objects.hashCode(this.heure);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Plage other = (Plage) obj;
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        if (!Objects.equals(this.heure, other.heure)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Plage{" + "date=" + date + ", heure=" + heure + '}';
    }

}
