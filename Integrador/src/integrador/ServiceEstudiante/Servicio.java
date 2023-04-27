/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrador.ServiceEstudiante;

import integrador.entidades.Estudiante;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author EUGE
 */
public class Servicio {
    /*usando ese arreglo tenemos que realizar las
dos tareas que nos ha pedido la escuela.
1. Calcular y mostrar el promedio de notas de todo el curso
*/
   public double promedioNotas(Estudiante[] e){
       double prom=0;
       for (int i = 0; i < e.length; i++) {
           prom+= e[i].getNota();
       }
       prom=prom/e.length;
       System.out.println("El promedio del curso es " + prom);
       return prom;
   }
   /*
   2. Retornar otro arreglo con los nombre de los alumnos que recibieron una
nota mayor al promedio del curso
   */
    //public ArrayList mejoresAlumnos(Estudiante[] e, double prom){
    public String[] mejoresAlumnos(Estudiante[] e, double prom){
        //ArrayList<String> mejoresAlumnos = new ArrayList<>();  
        String [] mejoresAlumnos = new String [8]; 
        for (int i = 0; i < e.length; i++) {
            if (e[i].getNota()>prom) {
                mejoresAlumnos[i]= e[i].getNombre();    
            }
            //if (e[i].getNota()>prom) {
            //   mejoresAlumnos.add(e[i].getNombre());
            //}
        }
        return mejoresAlumnos;
    }
    /*3. Por último, deberemos mostrar todos los estudiantes con una nota
mayor al promedio.*/
    //public void mostrarEstudiante (ArrayList <String> mejoresAlumnos){
    public void mostrarEstudiante (String [] mejoresAlumnos){
        //System.out.println("Los estudiantes con nota mayor al promedio son: " + mejoresAlumnos.toString() );
        System.out.println("Los estudiantes con nota mayor al promedio son: " );
        for (int i = 0; i < 8; i++) {
            if (null!=mejoresAlumnos[i]) {
                System.out.println(mejoresAlumnos[i]);
            }    
        }
    }
}
