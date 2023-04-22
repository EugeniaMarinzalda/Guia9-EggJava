/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9.ejer5.PersonaService;

import java.util.Date;
import java.util.Scanner;
import guia9.ejer5.entidades.Persona;

/**
 Crear una clase PersonaService,
en el paquete servicio, con los siguientes métodos:
 * @author EUGE
 */
public class PersonaService {
    /*
    a) Método crearPersona que pida al usuario Nombre y fecha de
nacimiento de la persona a crear. Retornar el objeto Persona creado.
    */
    private Scanner leer = new Scanner(System.in);
    public Persona crearPersona(){
        System.out.println("Ingrese el nombre");
        String nombre= leer.nextLine();
        System.out.println("Ingrese el año de nacimiento");
        int anio = leer.nextInt();
        System.out.println("Ingrese el mes de nacimiento");
        int mes = leer.nextInt();
        System.out.println("Ingrese el día de nacimiento");
        int dia = leer.nextInt();
        Date fecha = new Date(anio-1900,mes-1,dia);
        return new Persona(nombre,fecha);  
    }
    /*
    b) Método calcularEdad que calcule la edad del usuario utilizando el
atributo de fecha de nacimiento y la fecha actual.
    */
    public int calcularEdad(Persona p){
        Date fechaActual = new Date();
        int edad = fechaActual.getYear()-p.getFechaNacimiento().getYear();
        return edad;
    }
    /*
    c) Método menorQue recibe como parámetro una Persona y una edad.
Retorna true si la persona es menor que la edad consultada o false
en caso contrario.
    */
    public boolean menorQue(Persona p, int edad){
        if (calcularEdad(p)<edad) {
            return true;
        } else {
            return false;
        }
    }    
    /*
    d) Método mostrarPersona que muestra la información de la persona
deseada.   
    */
    public void mostrarPersona(Persona p){
        System.out.println(p.toString());
    }
}
/*
public class personaServicio {
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private final FechaService service = new FechaService();
   
    public Persona crearPersona(){
        System.out.println("Ingrese su nombre");
        String nombre = leer.nextLine();
       Date fechaN= service.fechaNacimiento();
        
        return new Persona(nombre,fechaN);
    }
    
    public int calcularEdad(Persona p){
        
       return service.diferencia(p.getNacimiento(), new Date());
    }
    
    public boolean menorQue (Persona p, int edad){
      return calcularEdad(p)> edad;
      
    }
    
    public void mostrarPersona(Persona p){
        System.out.println(p.toString()); 
    }
*/