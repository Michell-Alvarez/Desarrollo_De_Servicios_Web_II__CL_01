/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl01_michell_alvarez_pregunta02;

/**
 *
 * @author Michell
 */
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       CajeroAutomatico cajero = new CajeroAutomatico();
       Thread michell = new Thread(cajero,"Michell");
       Thread adrian = new Thread(cajero,"Adrian");
       Thread julian = new Thread(cajero,"Julian");
       
       michell.start();
       adrian.start();
       julian.start();
       
    }
    
}
