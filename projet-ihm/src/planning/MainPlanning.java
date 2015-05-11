
package planning;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.*;
//oui commit
public class MainPlanning {
//allo
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Création des objets
        Planning p = new Planning();
        Planning p1 = new Planning();
        Plage plage = new Plage("11/02/2015", "14:40");
        Salle s = new Salle(new Prof("Ung", "Steven"), "A13");
        Salle s1 = new Salle(new Prof("Mirtil", "Marvin"), "A14");
        Salle s2 = new Salle(new Prof("Bilgen", "Tugay"), "A14");
        Salle s3 = new Salle(new Prof("Patrick", "Sébastien"), "A15");
        
        //Imbrication des objets les uns dans les autres
        try {
            p.ajouterPlage(plage);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        try {
            p.ajouterSalle(plage, s);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        try {
            p.ajouterSalle(plage, s1);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        try {
            p.ajouterSalle(plage, s2);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        try {
            p.ajouterSalle(plage, s3);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        System.out.println(p);

        //Enregistrement et ouverture d'un planning
        try {
            p.enregistrer("planning.ser");
        } catch (IOException ex) {
            Logger.getLogger(MainPlanning.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            p1.ouvrir("planning.ser");
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(MainPlanning.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println(p1);
    }

}
