
package model;

import java.io.Serializable;
import java.util.Objects;

public class Salle implements Serializable {

    private Formateur formateur;
    private String numeroSalle;

    public Salle(Formateur formateur, String numeroSalle) {
        this.formateur = formateur;
        this.numeroSalle = numeroSalle;
    }

    public Formateur getFormateur() {
        return formateur;
    }

    public String getNumeroSalle() {
        return numeroSalle;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.numeroSalle);
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
        final Salle other = (Salle) obj;
        if (!Objects.equals(this.numeroSalle, other.numeroSalle)) {
            return false;
        }
        return true;
    }


    @Override
    public String toString() {
        return "Salle{" + "formateur=" + formateur + ", numeroSalle=" + numeroSalle + '}';
    }

}
