/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Objects;

/**
 *
 * @author PC
 */
public class Seance {
    
    private Module moduleSeance ;
    private int nbTotalSeance ;
    private int rangSeance ;


    public Seance(Module moduleSeance) {
        this.moduleSeance = moduleSeance;
        this.nbTotalSeance = moduleSeance.getNb_seance();
    }

    public Module getModuleSeance() {
        return moduleSeance;
    }

    public int getNbTotalSeance() {
        return nbTotalSeance;
    }

    public int getRangSeance() {
        return rangSeance;
    }

    public void setModuleSeance(Module moduleSeance) {
        this.moduleSeance = moduleSeance;
    }

    public void setNbTotalSeance(int nbTotalSeance) {
        this.nbTotalSeance = nbTotalSeance;
    }

    public void setRangSeance(int rangSeance) {
        this.rangSeance = rangSeance;
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Seance other = (Seance) obj;
        if (!Objects.equals(this.moduleSeance, other.moduleSeance)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Seance{" + "moduleSeance=" + moduleSeance + ", RangSeance=" + rangSeance + "/" + nbTotalSeance + '}';
    }
    
    


  
    
    
    
}
