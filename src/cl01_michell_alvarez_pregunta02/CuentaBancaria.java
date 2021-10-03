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
public class CuentaBancaria {
    private int saldoActual = 150;

    public int getSaldoActual() {
        return saldoActual;
    }
    
    public void retiroDeCuenta(int valorRetiro){
        saldoActual = saldoActual - valorRetiro;
        
    }
    
    
}
