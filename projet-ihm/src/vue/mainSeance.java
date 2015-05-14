/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.*;
/**
 *
 * @author PC
 */
public class mainSeance {
    public static void main(String[] args){
        Module module1 = new Module("mathematique","maths","rouge",10,3);
        
        
        Seance seance1 = new Seance(module1);
        System.out.println(seance1.toString());
        Seance seance2 = new Seance(module1);
        System.out.println(seance2.toString());
    }
}
