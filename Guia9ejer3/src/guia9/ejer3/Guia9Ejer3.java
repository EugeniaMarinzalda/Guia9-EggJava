/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9.ejer3;

import guia9.ejer3.Servicio.ArregloService;

/**
 *
 * @author EUGE
 */
public class Guia9Ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Crear en el Main dos arreglos. El arreglo A de 50 números reales y el
arreglo B de 20 números reales. 
        */
        double [] A = new double [50];
        double [] B = new double [20];
        /*En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B,
mostrar A y B.*/
        ArregloService ss = new ArregloService();
        ss.inicializarA(A);
        System.out.println("Matriz A");
        ss.mostrar(A);
        ss.ordenar(A); // muestra
        System.out.println("Matriz ordenada de mayor a menor");
        ss.mostrar(A);
        ss.inicializarB(B, A);
        System.out.println("Matriz B");
        ss.mostrar(B);
    }
    
}
