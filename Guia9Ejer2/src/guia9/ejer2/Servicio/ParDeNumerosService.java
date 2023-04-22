/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9.ejer2.Servicio;

import guia9.ejer2.entidades.ParDeNumeros;

/**
 *Crear una clase ParDeNumerosService, en el paquete
Servicios, que deberá además implementar los siguientes métodos:




 * @author EUGE
 */
public class ParDeNumerosService {
    /*
a) Método mostrarValores que muestra cuáles son los dos números
guardados.
*/
    public void mostrarValores (ParDeNumeros e) {
        System.out.println("El numero 1 es: " + String.format("%.2f",e.getNum1()) + " y el numero 2 es: " + String.format("%.2f",e.getNum2()));
    }
    /*
    b) Método devolverMayor para retornar cuál de los dos atributos tiene
el mayor valor
    */
    public static void devolverMayor (ParDeNumeros e) {
        System.out.println(String.format("%.2f",Math.max(e.getNum1(),e.getNum2())));
    }
    /*
    c) Método calcularPotencia para calcular la potencia del mayor valor de
la clase elevado al menor número. Previamente se deben redondear
ambos valores.
    */
    public void calcularPotencia(ParDeNumeros e) {
        double mayor = Math.max(e.getNum1(),e.getNum2());
        mayor = Math.round(mayor);
        double menor = Math.min(e.getNum1(),e.getNum2());
        menor = Math.round(menor);
        double potencia = Math.pow(mayor,menor);
        System.out.println("El resultado de el mayor " + String.format("%.2f",mayor) + " por la potencia de " + String.format("%.2f",menor) + " es : " +potencia);
    }
   /*
    d) Método calculaRaiz, para calcular la raíz cuadrada del menor de los
dos valores. Antes de calcular la raíz cuadrada se debe obtener el
valor absoluto del número.
    */ 
    public void calculaRaiz(ParDeNumeros e) {
        double menor = Math.min(e.getNum1(),e.getNum2());
        menor = Math.abs(menor);
        double raiz = Math.sqrt(menor);
        System.out.println("El resultado de la raiz cuadrada de " + String.format("%.2f",menor) + " es : " + String.format("%.2f",raiz));
    }
}
