package model;

/**
 *
 * @author Marvin
 */
public class Calendrier {
    private Integer annee;
    private Integer semaine;
    private String samediOuvrable;
    private String dimancheOuvrable;

    public Calendrier(Integer annee, Integer semaine) {
        this.annee = annee;
        this.semaine = semaine;
        
    }

    public Integer getAnnee() {
        return annee;
    }

    public void setAnnee(Integer annee) {
        this.annee = annee;
    }

    public Integer getSemaine() {
        return semaine;
    }

    public void setSemaine(Integer semaine) {
        this.semaine = semaine;
    }

    public String getSamediOuvrable() {
        return samediOuvrable;
    }

    public void setSamediOuvrable(String samediOuvrable) {
        this.samediOuvrable = samediOuvrable;
    }

    public String getDimancheOuvrable() {
        return dimancheOuvrable;
    }

    public void setDimancheOuvrable(String dimancheOuvrable) {
        this.dimancheOuvrable = dimancheOuvrable;
    }

    @Override
    public String toString() {
        return "Calendrier{" + "annee=" + annee + ", semaine=" + semaine + ", samediOuvrable=" + samediOuvrable + ", dimancheOuvrable=" + dimancheOuvrable + '}';
    }
    
    
}

