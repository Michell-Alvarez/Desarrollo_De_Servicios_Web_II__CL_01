/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl01_michell_alvarez_pregunta01;

import java.awt.Frame;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Michell
 */
public class CL01_Michell_Alvarez_Pregunta01 {

        private static Frame parent;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carrera micarrera = new Carrera(parent, true);
        micarrera.setVisible(true);
        
    }
    
}
