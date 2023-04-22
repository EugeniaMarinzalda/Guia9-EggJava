/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9.ejer6.ServiceClase;

import guia9.ejer6.entidad.Curso;
import java.util.Scanner;

/**
 *


 * @author EUGE
 */
public class ServiceClase {
    /*
    d) Método cargarAlumnos(): este método le permitirá al usuario ingresar
los alumnos que asisten a las clases. Nosotros nos encargaremos de
almacenar esta información en un arreglo e iterar con un bucle,
solicitando en cada repetición que se ingrese el nombre de cada
alumno.
    */
    public static void cargarAlumno(Curso a){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String [] alumno = new String [5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del alumno " + (i+1));
            alumno[i]= leer.next();
        }
        a.setAlumnos(alumno);
    }
    /*
    e) Método crearCurso(): el método crear curso, le pide los valores de
los atributos al usuario y después se le asignan a sus respectivos
atributos para llenar el objeto Curso. En este método invocamos al
método cargarAlumnos() para asignarle valor al atributo alumnos
    */
    public static Curso crearCurso(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el nombre del curso");
        String nombreCurso = leer.next();
        System.out.println("Ingrese la cantidad de horas por dia");
        double cantidadHorasPorDia = leer.nextDouble();
        System.out.println("Ingrese la cantidad de dias por semana");
        int cantidadDiasPorSemana = leer.nextInt();
        System.out.println("Ingrese el turno (Mañana / Tarde)");
        String turno = leer.next();
        System.out.println("Ingrese el precio por hora");
        double precioPorHora= leer.nextDouble();
        Curso a = new Curso (nombreCurso,cantidadHorasPorDia,cantidadDiasPorSemana,turno,precioPorHora);
        ServiceClase.cargarAlumno(a);
        return a;
    }

/*
f) Método calcularGananciaSemanal(): este método se encarga de
calcular la ganancia en una semana por curso. Para ello, se deben
multiplicar la cantidad de horas por día, el precio por hora, la
cantidad de alumnos y la cantidad de días a la semana que se repite
el encuentro.
*/
    public static double calcularGananciaSemanal(Curso a){
        return a.getCantidadHorasPorDia()*a.getCantidadDiasPorSemana()*a.getPrecioPorHora()*a.getAlumnos().length;
    }
    
}
