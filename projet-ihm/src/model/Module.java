
package model;


import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author G47575
 */
public class Module implements Serializable {

    private String nom;
    private String abreviation;
    private String couleur;
    private Integer nb_seance;
    private Integer duree;

    public Module(String nom, String abreviation, String couleur, Integer nb_seance, Integer duree) {
        this.nom = nom;
        this.abreviation = abreviation;
        this.couleur = couleur;
        this.nb_seance = nb_seance;
        this.duree = duree;
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

    public Integer getNb_seance() {
        return nb_seance;
    }

    public void setNb_seance(Integer nb_seance) {
        this.nb_seance = nb_seance;
    }

    public Integer getDuree() {
        return duree;
    }

    public void setDuree(Integer duree) {
        this.duree = duree;
    }

   
    
   

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.nom);
        hash = 59 * hash + Objects.hashCode(this.abreviation);
        hash = 59 * hash + Objects.hashCode(this.couleur);
        hash = 59 * hash + Objects.hashCode(this.nb_seance);
        hash = 59 * hash + Objects.hashCode(this.duree);
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
        final Module other = (Module) obj;
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
        if (!Objects.equals(this.duree, other.duree)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Module{" + "nom=" + nom + ", abreviation=" + abreviation + ", couleur=" + couleur + ", nb_seance=" + nb_seance + ", duree=" + duree + '}';
    }

   

    

}
