/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9.ejer3.Servicio;

import java.text.DecimalFormat;
import java.util.Arrays;

/**
 *Crear la clase ArregloService, en el
paquete servicio, con los siguientes métodos:
 * @author EUGE
 */
public class ArregloService {
    /*1) Método inicializarA recibe un arreglo por parámetro y lo inicializa con
números aleatorios.*/
    public void inicializarA(double [] A){
        for (int i = 0; i < 49; i++) {
            A[i]=Math.random()*10;
            //System.out.print("[" + String.format("%.2f",A[i])+"] ");
        }
    }
    /*
    2) Método mostrar recibe un arreglo por parámetro y lo muestra por
pantalla.
    */
    public void mostrar(double [] A){
        System.out.println(Arrays.toString(A));
        System.out.println("");
    }
    /*
    3) Método ordenar recibe un arreglo por parámetro y lo ordena de
mayor a menor. 
    */
    public void ordenar(double [] A){
        Arrays.sort(A);  // ordena de menor a mayor
        double [] aux = new double [50];
        int j = A.length-1;
        for (int i = 0; i < aux.length; i++) {
            aux[i] = A [j];
            j--;
        }
        for (int i = 0; i < A.length; i++) {
            A[i] = aux [i];
        }
        /*for (int i = 0; i < A.length/2; i++) {
           A[i]=A[A.length-1-i];
        }   */
    }
    /*
    4) Método inicializarB copia los primeros 10 números del arreglo A en el
arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.

    */
    public void inicializarB (double [] B , double [] A){
        Arrays.fill(B, 0.5);
        for (int i = 0; i < 10; i++) {
            B[i]=A[i];
        }
            
        
    }
}
