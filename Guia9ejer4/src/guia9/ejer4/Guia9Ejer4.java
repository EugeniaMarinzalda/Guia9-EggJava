/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9.ejer4;

import guia9.ejer4.FechaServicio.FechaServicio;
import java.util.Date;

/**
 *Vamos a usar la clase Date que ya existe en Java. 
 * @author EUGE
 */
public class Guia9Ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FechaServicio ss = new FechaServicio();
        int diferencia = FechaServicio.diferencia();
        
    }
    
}
/*
public static void main(String[] args) {
      FechaService serv = new FechaService();
        
      Date nac=serv.fechaNacimiento();
      Date act= serv.fechaActual();
      
      System.out.println(serv.diferencia(nac, act)); 
        
    }
*/