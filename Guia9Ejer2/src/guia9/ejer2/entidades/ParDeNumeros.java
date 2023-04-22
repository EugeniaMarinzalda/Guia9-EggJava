/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9.ejer2.entidades;

/**
 * 
 * @author EUGE
 */
public class ParDeNumeros {
    /*
    Realizar una clase llamada ParDeNumeros que tenga como atributos dos
números reales con los cuales se realizarán diferentes operaciones
matemáticas.
    */
    private double num1, num2;
//La clase debe tener un constructor vacío, getters y setters.
   // En el constructor vacío se usará el Math.random para generar los dos números. 
    public ParDeNumeros() {
        this.num1=Math.random()*10;
        this.num2=Math.random()*10;
        
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
}
