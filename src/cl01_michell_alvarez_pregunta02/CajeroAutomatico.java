/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl01_michell_alvarez_pregunta02;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Michell
 */
public class CajeroAutomatico implements  Runnable{

    CuentaBancaria miprimeracuentaBancaria = new CuentaBancaria();
    @Override
    public void run() {
        int i=0;
        while (i<6){
            
            try {
                retirarDineroCuenta(20);       
                
                if (miprimeracuentaBancaria.getSaldoActual() <0) {
                   System.out.println("Su cuenta posee saldo negativo");
                    
                }
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(CajeroAutomatico.class.getName()).log(Level.SEVERE, null, ex);
            }
            i=i+1;
        }
    }

    private synchronized void retirarDineroCuenta(int valorRetirado) {
        if (miprimeracuentaBancaria.getSaldoActual()>=valorRetirado) {
            System.out.println("Saldo Actual :"+miprimeracuentaBancaria.getSaldoActual());
            System.err.println("El usuario "+Thread.currentThread().getName() +
            " esta realizando retiro de " + valorRetirado + " Soles");
            
            miprimeracuentaBancaria.retiroDeCuenta(valorRetirado);
            
            System.out.println("El retiro se realizo de forma exitosa! :"+
             " el nuevo saldo es : " + miprimeracuentaBancaria.getSaldoActual());
        } else {
            System.out.println("No hay saldo suficiente para realizar la transacción");            
        }
        
        
    }     
    
}
