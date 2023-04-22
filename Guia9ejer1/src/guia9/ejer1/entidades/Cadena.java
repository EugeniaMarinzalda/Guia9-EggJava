/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9.ejer1.entidades;

/**
 *Realizar una clase llamada Cadena, en el paquete de entidades,  
 * @author EUGE
 */
public class Cadena {
    //que tenga como atributos una frase (String) y su longitud.
    private String frase;
    private int longitud;
    //Agregar constructor vacío y con atributo frase solamente
    public Cadena() {
    }
    //El constructor con frase como atributo debe setear la longitud de la frase de manera automática. 
    public Cadena(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }
    //Agregar getters y setters.

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", longitud=" + longitud + '}';
    }
    
}
