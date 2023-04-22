/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9.ejer5;

import guia9.ejer5.PersonaService.PersonaService;
import guia9.ejer5.entidades.Persona;
import java.util.Scanner;

/**
 *Implemente la clase Persona en el paquete entidades. Una persona tiene
un nombre y una fecha de nacimiento (Tipo Date), constructor vacío,
constructor parametrizado, get y set. 
* Crear una clase PersonaService,
en el paquete servicio, con los siguientes métodos:
a) Método crearPersona que pida al usuario Nombre y fecha de
nacimiento de la persona a crear. Retornar el objeto Persona creado.
b) Método calcularEdad que calcule la edad del usuario utilizando el
atributo de fecha de nacimiento y la fecha actual.
c) Método menorQue recibe como parámetro una Persona y una edad.
Retorna true si la persona es menor que la edad consultada o false
en caso contrario.
d) Método mostrarPersona que muestra la información de la persona
deseada.
4
 * @author EUGE
 */
public class Guia9Ejer5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        PersonaService ss = new PersonaService ();
        Persona p1 = ss.crearPersona();
        System.out.println("Ingrese la edad a comparar");
        int edad = leer.nextInt();
        if (ss.menorQue(p1, edad)){
            System.out.println("La persona es menor que " + edad + " años");
        } else {
            System.out.println("La persona es mayor que " + edad + " años");
        }
        ss.mostrarPersona(p1);
    }
    
}
