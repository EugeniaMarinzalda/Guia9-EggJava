/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9.ejer2;


import guia9.ejer2.Servicio.ParDeNumerosService;
import guia9.ejer2.entidades.ParDeNumeros;

/**
 *Realizar una clase llamada ParDeNumeros que tenga como atributos dos
números reales con los cuales se realizarán diferentes operaciones
matemáticas. La clase debe tener un constructor vacío, getters y setters.
En el constructor vacío se usará el Math.random para generar los dos
números. Crear una clase ParDeNumerosService, en el paquete
Servicios, que deberá además implementar los siguientes métodos:
a) Método mostrarValores que muestra cuáles son los dos números
guardados.
b) Método devolverMayor para retornar cuál de los dos atributos tiene
el mayor valor
c) Método calcularPotencia para calcular la potencia del mayor valor de
la clase elevado al menor número. Previamente se deben redondear
ambos valores.
d) Método calculaRaiz, para calcular la raíz cuadrada del menor de los
dos valores. Antes de calcular la raíz cuadrada se debe obtener el
valor absoluto del número.
 * @author EUGE
 */
public class Guia9Ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ParDeNumerosService s = new ParDeNumerosService();
        ParDeNumeros r = new ParDeNumeros();
        s.mostrarValores(r);
        ParDeNumerosService.devolverMayor(r); // con static
        s.calcularPotencia(r);
        s.calculaRaiz(r);
    }
    /*
    PARA PONER MENOS DECIMALES
    double numero = 3.14159265359;
DecimalFormat formato = new DecimalFormat("#.##");
System.out.println(formato.format(numero));
    
    double numero = 3.14159265359;
System.out.println(String.format("%.2f", numero));
    */
}
