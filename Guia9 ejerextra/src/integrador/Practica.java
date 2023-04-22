package integrador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Practica {

    
//    La función recibirá un numero x y deberá determinar si es capicúa o no. 
//    Este deberá devolver verdadero(true) si es capicúa y falso(false) si no lo es. 
//    Además deberemos contemplar los siguientes escenarios: 
//    Contemplar que el numero que llega puede ser negativo. 
//    Contemplar que el numero que llega puede ser de un digito, si es así debe devolver true. 
//    Contemplar que el numero que llega puede ser null, si es así debe devolver false.
//    @param num
//    @return esPalindromo
     
    public Boolean numeroCapicua(Integer num) {
        //int numAbs = Math.abs(num);
        boolean capi = true;
        if (num == null) {
            capi = false;
        } else {
            String numeroCadena = Integer.toString(Math.abs(num));
            int j = numeroCadena.length()-1;
                for (int i = 0 ; i < numeroCadena.length(); i++) {
                //    System.out.println("Valor en la posicion "+i+" "+ numeroCadena.substring(i,i+1));
                //    System.out.println("Valor en la posicion "+j+" "+ numeroCadena.substring(j,j+1));
                if (numeroCadena.substring(i,i+1).equalsIgnoreCase(numeroCadena.substring(j,j+1))) {
                    //System.out.println("igual");
                } else { 
                    capi = false;
                    //System.out.println("Distinto");
                }
                j--;
                }
        }
        System.out.println(capi);
        return capi;            
    }

    
//    Estamos en caramelolandia, donde estan los peores ladrones de dulces. 
//    Una vez al mes, se sienta una n cantidad de presos en ronda, contemplando 
//    al preso que inicia la ronda, como el preso 0. 
//    A los presos se les da una m cantidad de caramelos, estos caramelos se repartirán de uno en uno a cada preso, 
//    contemplando que se comenzaran a repartir los caramelos desde el primer preso (inicio). 
//    Se repartirán los caramelos hasta que no queden más y el ultimo caramelo en repartirse estará podrido, 
//    determinar a que preso, según su posición en la ronda le tocara el caramelo podrido.
//     @param inicio
//     @param cantidadCaramelos
//     @param cantidadLadrones
//     @return ladronQueLeTocoElCarameloPodrido
     
    public int prisioneroDulce(int inicio, int cantidadCaramelos, int cantidadLadrones) {
        boolean carameloPodrido = true;
        int prisionero = 0;
        do {            
            if (cantidadCaramelos>cantidadLadrones) {
                int tanda = cantidadCaramelos/cantidadLadrones;
                //System.out.println("Reparti " + tanda + " caramelos a cada uno");
                int quedan = cantidadCaramelos%cantidadLadrones;
                //System.out.println("Quedan " + quedan + " caramelos para repartir");
                cantidadCaramelos=quedan;
            }
            if(cantidadCaramelos==0){
                    carameloPodrido=false;
                    prisionero=inicio;
                    System.out.println("El caramelo podrido lo tiene el prisionero " + prisionero);
                    
                    break;
            } else {
                    
                
                    for (int i = 0; i < cantidadLadrones; i++) {
                        prisionero = i+inicio;
                        if ((inicio+i)>cantidadLadrones) {
                            prisionero=prisionero-cantidadLadrones;
                        }
                        
                        //System.out.println("Prisionero "+ prisionero + " toma un caramelo"); 
                        cantidadCaramelos--;
                        if (cantidadCaramelos==0) {
                            System.out.println("El caramelo podrido lo tiene el prisionero " + prisionero); 
                            break;
                        }
                        carameloPodrido=false;
                        
                    }                    
            }
                
        } while (carameloPodrido);

        return prisionero;
    }

//    En un universo paralelo, donde los habitantes son medias, existe un crucero de medias donde se sube una lista de medias. 
//    Esta lista de tripulantes del crucero es una Collection de letras. 
//    Lo que se deberá hacer, es filtrar la lista de medias que se suben al crucero y 
//    retornar una lista que contenga los grupos de medias que si tenían pares. 
//    Esta lista final de medias pares se mostraran ordenadas de menor a mayor.
//    A continuación un ejemplo: 
//    List de medias que llegan : A,B,A,B,C,A,F,Z,C,H. A,B y C tiene pares, mientras que F,Z y H no. 
//    Entonces la List que se debería retornar sería: A,B,C.
//   @param pasajeros
//   @return mediasAmigas

    public List<String> mediasAmigas(List<String> pasajeros){
        
        List <String> mediasPares = new ArrayList <>();
        List <String> buscandoPar = new ArrayList <>();
        for (int i = 0; i < pasajeros.size(); i++) {
            if (buscandoPar.contains(pasajeros.get(i)) ){
                if (!mediasPares.contains(pasajeros.get(i))) {
                    mediasPares.add(pasajeros.get(i));
                }
            } else {
                buscandoPar.add(pasajeros.get(i));
            }    
        }
        mediasPares.sort(Comparator.naturalOrder());

        return mediasPares;
    }
}
