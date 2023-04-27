/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrador;

import integrador.ServiceEstudiante.Servicio;
import integrador.entidades.Estudiante;
import java.util.ArrayList;

/**
 *
 * @author EUGE
 */
public class Integrador {

    /**
     * Ejercicio integrador 
     * Una escuela ha terminado su ciclo lectivo y todos sus alumnos ya rindieron el
examen final. La escuela nos ha pedido que calculemos el promedio de notas
final de todos sus alumnos y saber qué alumnos han recibido una nota por
encima de ese promedio.
Para esto vamos a tener que crear un objeto de tipo Estudiante, sus atributos
van a ser nombre y nota (representando la nota obtenida en el final).
La escuela consta con tan solo 8 estudiantes, por lo que deberemos crear los 8
estudiantes con sus respectivas notas.
Una vez creado los estudiantes deberemos guardar los estudiantes en un
arreglo de objetos tipo Estudiante, usando ese arreglo tenemos que realizar las
dos tareas que nos ha pedido la escuela.
1. Calcular y mostrar el promedio de notas de todo el curso
2. Retornar otro arreglo con los nombre de los alumnos que recibieron una
nota mayor al promedio del curso
3. Por último, deberemos mostrar todos los estudiantes con una nota
mayor al promedio.
Nota: para crear un vector de objetos la definición es la siguiente:
Objeto nombreVector[] = new Objeto[];
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*La escuela consta con tan solo 8 estudiantes, por lo que deberemos crear los 8
estudiantes con sus respectivas notas.
        Una vez creado los estudiantes deberemos guardar los estudiantes en un
arreglo de objetos tipo Estudiante*/
        int cantEstudiantes = 8;
        Estudiante [] estudiantes = new Estudiante[cantEstudiantes];
        estudiantes[0] = new Estudiante("Sofía",8.7);
        estudiantes[1] = new Estudiante("Alejandro",6.4);
        estudiantes[2] = new Estudiante("Isabella",9.2);
        estudiantes[3] = new Estudiante("Miguel",7.5);
        estudiantes[4] = new Estudiante("Valentina",5.1);
        estudiantes[5] = new Estudiante("Santiago",8.8);
        estudiantes[6] = new Estudiante("Camila",9.0);
        estudiantes[7] = new Estudiante("Juan",6.8);
        //
        Servicio ss = new Servicio();
        double promedioNota = ss.promedioNotas(estudiantes);
        //ArrayList<String> mejoresAlumnos = new ArrayList<String>();
        String[] mejoresAlumnos = new String [8];
        mejoresAlumnos=ss.mejoresAlumnos(estudiantes, promedioNota);
        ss.mostrarEstudiante(mejoresAlumnos);
        
        
    }
    
}

