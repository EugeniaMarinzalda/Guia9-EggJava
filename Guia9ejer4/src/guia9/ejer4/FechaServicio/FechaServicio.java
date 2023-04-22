/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9.ejer4.FechaServicio;


import java.util.Date;
import java.util.Scanner;

/**
 *Crearemos la clase
FechaService, en paquete Servicios, que tenga los siguientes métodos:
 * @author EUGE
 */
public class FechaServicio {
   /* a) Método fechaNacimiento que pregunte al usuario día, mes y año de
su nacimiento. Luego los pase por parámetro a un nuevo objeto Date.
El método debe retornar el objeto Date. Ejemplo fecha: Date fecha =
new Date(anio, mes, dia);*/
    public static Scanner leer = new Scanner(System.in);
    
    public static Date fechaNacimiento(){
        System.out.println("Ingrese su año de nacimiento");
        int anio = leer.nextInt();
        System.out.println("Ingrese su mes de nacimiento");
        int mes= leer.nextInt();
        System.out.println("Ingrese su dia de nacimiento");
        int dia= leer.nextInt();
        return new Date(anio-1900,mes-1,dia);
    }
    /*
    b) Método fechaActual que cree un objeto fecha con el día actual. Para
esto usaremos el constructor vacío de la clase Date. Ejemplo: Date
fechaActual = new Date();
El método debe retornar el objeto Date.
    */
    public static Date fechaActual(){
        Date fechaActual = new Date();
        return fechaActual;
    } 
    /*
    c) Método diferencia que reciba las dos fechas por parámetro y retorna
la diferencia de años entre una y otra (edad del usuario).
Si necesiten acá tienen más información en clase Date: Documentacion
Oracle
    */
    public static int diferencia(){
        int diferencia = fechaActual().getYear()- fechaNacimiento().getYear();
        System.out.println("La edad es " + diferencia);
        return diferencia;
    }
}
/*
private Scanner leer = new Scanner(System.in);
   
    public Date fechaNacimiento(){
        
      System.out.println("Ingrese dia, mes y año de su nacimiento");
      int dia = leer.nextInt();
      int mes = leer.nextInt();
      int anio = leer.nextInt();
      return new Date (anio-1900,mes-1,dia);
        
    }
    
    public Date fechaActual(){
        return new Date();
    }
    
    public int diferencia(Date nac, Date act){
      return  act.getYear()-nac.getYear();
    }

otro 

public static int diferencia(Date nac, Date act){
        int diferencia;
        diferencia = act.getYear()-nac.getYear();
        if (act.getMonth()<nac.getMonth()){
            diferencia--;
        }else if (act.getMonth()==nac.getMonth()){
            if (act.getDay()<nac.getDay()){
                diferencia--;
            }
        }
        
        
        return diferencia;
*/