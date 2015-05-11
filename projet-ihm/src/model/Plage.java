
package model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author G47575
 */
public class Plage implements Serializable {

    private String nom;
    private String abreviation;
    private String couleur;
    private String nb_seance;

    public Plage(String nom, String abreviation, String couleur, String nb_seance) {
        this.nom = nom;
        this.abreviation = abreviation;
        this.couleur = couleur;
        this.nb_seance = nb_seance;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAbreviation() {
        return abreviation;
    }

    public void setAbreviation(String abreviation) {
        this.abreviation = abreviation;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getNb_seance() {
        return nb_seance;
    }

    public void setNb_seance(String nb_seance) {
        this.nb_seance = nb_seance;
    }
    
   

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.nom);
        hash = 59 * hash + Objects.hashCode(this.abreviation);
        hash = 59 * hash + Objects.hashCode(this.couleur);
        hash = 59 * hash + Objects.hashCode(this.nb_seance);
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
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        if (!Objects.equals(this.abreviation, other.abreviation)) {
            return false;
        }
        if (!Objects.equals(this.couleur, other.couleur)) {
            return false;
        }
        if (!Objects.equals(this.nb_seance, other.nb_seance)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Plage{" + "nom=" + nom + ", abreviation=" + abreviation + ", couleur=" + couleur + ", nb_seance=" + nb_seance + '}';
    }

    

}
