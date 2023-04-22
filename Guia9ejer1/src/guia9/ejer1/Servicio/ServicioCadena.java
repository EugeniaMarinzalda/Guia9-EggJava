/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9.ejer1.Servicio;

import guia9.ejer1.entidades.Cadena;
import java.util.Scanner;

/**
 *Crear una clase CadenaServicio en el paquete servicios que implemente los siguientes métodos:
 * @author EUGE
 */
public class ServicioCadena {
    
    public Cadena pedirFrase(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la frase");
        String frase = leer.nextLine();
        return new Cadena(frase);
    }
       
    /*a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales
que tiene la frase ingresada.*/
    public void mostrarVocales(Cadena f){
        int cantVocales = 0;
        for (int i = 0; i < f.getLongitud(); i++) {
            if (f.getFrase().substring(i,i+1).equalsIgnoreCase("A")) {
                cantVocales++;
            } else if (f.getFrase().substring(i,i+1).equalsIgnoreCase("E")) {
                cantVocales++;
            } else if (f.getFrase().substring(i,i+1).equalsIgnoreCase("I")) {
                cantVocales++;
            } else if (f.getFrase().substring(i,i+1).equalsIgnoreCase("O")) {
                cantVocales++;
            } else if (f.getFrase().substring(i,i+1).equalsIgnoreCase("U")) {
                cantVocales++;
            }
        }
        System.out.println("Cantidad de vocales: " + cantVocales);
    }
    /*
    b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla
por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb
asac".
    */
    public void invertirFrase(Cadena f){
        System.out.println("Frase invertida: ");
        for (int i = f.getLongitud()-1 ; i > -1 ; i--) {
            System.out.print(f.getFrase().substring(i,i+1));
        }
        System.out.println("");
    } 
    /*
    c) Método vecesRepetido(String letra), recibirá un carácter ingresado
por el usuario y contabilizar cuántas veces se repite el carácter en la
frase, por ejemplo: Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4
veces.
    */
    public void vecesRepetido (Cadena f, String letra) {
        int aux = 0;
        for (int i = 0 ; i < f.getLongitud() ; i++) {
            if (f.getFrase().substring(i,i+1).equalsIgnoreCase(letra)) {
                aux++;
            }
        }
        System.out.println("El caracter " + letra + " se repite " + aux + " veces");
    }
    /*
    e) Método compararLongitud(String frase), deberá comparar la longitud
de la frase que compone la clase con otra nueva frase ingresada por
el usuario.
    */
    /*public void compararLongitud(Cadena f, Cadena g){
        if (f.getLongitud()== g.getLongitud()) {
            System.out.println("La longitud de las frases son iguales");
        } else if (f.getLongitud()> g.getLongitud()) { 
            System.out.println("La frase 1 es más extensa que la frase 2");
        } else {
            System.out.println("La frase 2 es más extensa que la frase 1");
        }
    }*/
    public void compararLongitud(Cadena f){
        System.out.println("Ingrese la frase 2");
        Scanner leer = new Scanner(System.in);
        String frase2 = leer.nextLine();
        if (f.getLongitud()== frase2.length()) {
            System.out.println("La longitud de las frases son iguales");
        } else if (f.getLongitud()> frase2.length()) { 
            System.out.println("La frase 1 es más extensa que la frase 2");
        } else {
            System.out.println("La frase 2 es más extensa que la frase 1");
        }
    }
    /*
    f) Método unirFrases(String frase), deberá unir la frase contenida en la
clase Cadena con una nueva frase ingresada por el usuario y mostrar
la frase resultante.
    */
    public void unirFrase(Cadena f){
        System.out.println("Ingrese la frase 2");
        Scanner leer = new Scanner(System.in);
        String frase2 = leer.nextLine();
        System.out.println(f.getFrase().concat(frase2));
    }
    /*
    g) Método reemplazar(String letra), deberá reemplazar todas las letras
“a” que se encuentren en la frase, por algún otro carácter
seleccionado por el usuario y mostrar la frase resultante.
    */
    public void reemplazar (Cadena f) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el caracter ");
        String caracter = leer.nextLine();
        String nvaFrase;
        nvaFrase= f.getFrase().replaceAll("a", caracter);
        System.out.println(nvaFrase);
    }
    /*
    h) Método contiene(String letra), deberá comprobar si la frase contiene
una letra que ingresa el usuario y devuelve verdadero si la contiene y
falso si no.
    */
    public void contiene (Cadena f) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la letra ");
        String letra = leer.nextLine();
        System.out.println(f.getFrase().contains(letra));
    }
}
