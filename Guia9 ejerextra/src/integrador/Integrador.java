package integrador;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Integrador {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Practica practica = new Practica();
        int num = (int) Math.log10(1000)+1;
       
        System.out.println(practica.numeroCapicua(null));
        System.out.println(practica.prisioneroDulce(5,10,5)); 

        ArrayList<String> medias = new ArrayList(Arrays.asList(new String[]{"A", "B", "C", "D","A", "C", "D", "A"}));

        System.out.println("Medias pares: " +practica.mediasAmigas(medias));

        /*
        NUMERO CAPICUA
        System.out.println("NUMERO CAPICUA");  
        System.out.println(practica.numeroCapicua(null));
        System.out.println( num );
        practica.numeroCapicua(num);
        int num1=123454321;
        System.out.println( num1 );
        practica.numeroCapicua(num1);
        int num2=-123454321;
        System.out.println( num2 );
        practica.numeroCapicua(num2);
        int num3=0;
        System.out.println( num3 );
        practica.numeroCapicua(num3);
        int num4=2;
        System.out.println( num4 );
        practica.numeroCapicua(num4);
        int num5=231;
        System.out.println( num5 );
        practica.numeroCapicua(num5);
        int num6=123;
        System.out.println( num6 );
        practica.numeroCapicua(num6);
        Integer num7=null;
        System.out.println( num7 );
        practica.numeroCapicua(num7);
       
        PRISIONERO DULCE
        System.out.println("PRISIONERO DULCE");
        System.out.println("Ingrese el numero de preso que inicia la ronda");
        int reoInicio = leer.nextInt();
        System.out.println("Ingrese la cantidad de caramelos a repartir");
        int caramelos = leer.nextInt();
        System.out.println("Ingrese la cantidad de total de prisioneros");
        int reos = leer.nextInt();
        practica.prisioneroDulce(reoInicio,caramelos,reos);
        System.out.println("Caso 1");
        practica.prisioneroDulce(8,5,10); // menos caramelos que reos y volver a comenzar
        System.out.println("Caso 2");
        practica.prisioneroDulce(2,26,10); // mas caramelos que reos
        System.out.println("Caso 3");
        practica.prisioneroDulce(4,3,10);// menos caramelos que reos y dentro del mismo
         System.out.println("Caso 4");
        practica.prisioneroDulce(7,10,10); // misma cantidad de caramelos que reos
        

        Aprender lista
        List<String> nombre_lista = new ArrayList<>(); // creo la lista
        nombre_lista.add("Valor1"); // agregar valores
        nombre_lista.add("Valor2");
        nombre_lista.add("Valor3");
        nombre_lista.add("Valor4");
        System.out.println(nombre_lista.toString());
        nombre_lista.size(); // tamaño de la lista
        nombre_lista.get(0); // obtener un valor de la lista
        nombre_lista.remove(1);
        System.out.println(nombre_lista); // no hace falta to.String
        
        for (String n : nombre_lista) { //para cada elemento n de la lista
            System.out.println(n);
        }
        */
    }
}
