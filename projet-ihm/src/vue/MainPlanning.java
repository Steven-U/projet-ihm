
package vue;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.*;
public class MainPlanning {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Création des objets
        Planning p = new Planning();
        Planning p1 = new Planning();
        Module module = new Module("module1","m1","blue",3,2);
        Salle s = new Salle(new Prof("Ung", "Steven"), "A13");
        Salle s1 = new Salle(new Prof("Mirtil", "Marvin"), "A14");
        Salle s2 = new Salle(new Prof("Bilgen", "Tugay"), "A14");
        Salle s3 = new Salle(new Prof("Patrick", "Sébastien"), "A15");
        
        //Imbrication des objets les uns dans les autres
        try {
            p.ajouterModule(module);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        try {
            p.ajouterSalle(module, s);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        try {
            p.ajouterSalle(module, s1);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        try {
            p.ajouterSalle(module, s2);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        try {
            p.ajouterSalle(module, s3);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        System.out.println(p);

        //Enregistrement et ouverture d'un planning
        try {
            p.enregistrer("planning.dat");
        } catch (IOException ex) {
            Logger.getLogger(MainPlanning.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            p1.ouvrir("planning.dat");
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(MainPlanning.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println(p1);
    }

}
