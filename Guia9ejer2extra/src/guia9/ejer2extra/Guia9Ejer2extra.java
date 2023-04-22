/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9.ejer2extra;

/**
 *Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual
deberá contener como atributos, un vector con la palabra a buscar, la
cantidad de letras encontradas y la cantidad jugadas máximas que
puede realizar el usuario. Definir los siguientes métodos en
AhorcadoService:
● Metodo crearJuego(): le pide la palabra al usuario y cantidad de
jugadas máxima. Con la palabra del usuario, pone la longitud de la
palabra, como la longitud del vector. Después ingresa la palabra en el
vector, letra por letra, quedando cada letra de la palabra en un índice
del vector. Y también, guarda la cantidad de jugadas máximas y el
valor que ingresó el usuario.
* Método longitud(): muestra la longitud de la palabra que se debe
encontrar. Nota: buscar como se usa el vector.length.
● Método buscar(letra): este método recibe una letra dada por el
usuario y busca si la letra ingresada es parte de la palabra o no.
También informará si la letra estaba o no.
● Método encontradas(letra): que reciba una letra ingresada por el
usuario y muestre cuantas letras han sido encontradas y cuántas le
faltan. Este método además deberá devolver true si la letra estaba y
false si la letra no estaba, ya que, cada vez que se busque una letra
que no esté, se le restará uno a sus oportunidades.
● Método intentos(): para mostrar cuántas oportunidades le queda al
jugador.
● Método juego(): el método juego se encargará de llamar todos los
métodos previamente mencionados e informará cuando el usuario
descubra toda la palabra o se quede sin intentos. Este método se
llamará en el main.
Un ejemplo de salida puede ser así:
Ingrese una letra:
a
Longitud de la palabra: 6
Mensaje: La letra pertenece a la palabra
Número de letras (encontradas, faltantes): (3,4)
Número de oportunidades restantes: 4
----------------------------------------------
Ingrese una letra:
z
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (3,4)
Número de oportunidades restantes: 3
3
---------------------------------------------
Ingrese una letra:
b
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (4,3)
Número de oportunidades restantes: 2
----------------------------------------------
Ingrese una letra:
u
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (4,3)
Número de oportunidades restantes: 1
----------------------------------------------
Ingrese una letra:
q
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Mensaje: Lo sentimos, no hay más oportunidades
4
 * @author EUGE
 */
public class Guia9Ejer2extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    /*
     public static void main(String[] args) {
       
       AhorcadoService play = new AhorcadoService();
       play.juego();
    }
    
}
    
   -----------------
    public class AhorcadoService {

    private Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Ahorcado crearJuego() {
        System.out.println("Ingresar la palabra para jugar");
        String palabra = sc.next();
        String palabraABuscar[] = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            palabraABuscar[i] = palabra.substring(i, i + 1);
        }

        //int largoDePalabra = palabra.length();
        System.out.println("Ingresar la cantidad de turnos");
        int turnos = sc.nextInt();

        return new Ahorcado(palabraABuscar, turnos);
    }

    //Método longitud(): muestra la longitud de la palabra que se debe encontrar.
    //Nota: buscar como se usa el vector.length
    public void mostrarLongitud(Ahorcado a) {
        System.out.println("La longitud del vector es: " + a.getPalabraABuscar().length);
    }

    //Método buscar(letra):  este método recibe una letra dada por el usuario y
    //busca si la letra ingresada es parte de la palabra o no. 
    //También informará si la letra estaba o no.
    public void buscarLetra(Ahorcado a,String letra) {
        
        int cont = 0;
        for (int i = 0; i < a.getPalabraABuscar().length; i++) {
            if (letra.equals(a.getPalabraABuscar()[i])){
                cont++;
                System.out.print("Se encontro : " + a.getPalabraABuscar()[i] + " " + (i+1));
            }
        }
        if (cont == 0) {
            System.out.println("No se encontro ningun match, como en tu Tinder");

        } else {
            System.out.println("La cantidad de letras encontras es: " + " " +cont);
        }
    }

//    Método encontradas(letra):  que reciba una letra ingresada por el usuario y 
//    muestre cuantas letras han sido encontradas y cuántas le faltan. Este método además deberá devolver true si la letra estaba 
//    y false si la letra no estaba, ya que, cada vez que se busque una letra que no esté, se le restará uno a sus oportunidades.
    
    public boolean letrasEncontradas(Ahorcado a, String letra){
        int cont = 0;
        for (int i = 0; i < a.getPalabraABuscar().length; i++) {
            if (letra.equals(a.getPalabraABuscar()[i])) {
                System.out.println(a.getPalabraABuscar()[i]);
                cont++;
            }
        }
        a.setLetrasEncontradas(cont + a.getLetrasEncontradas());
        System.out.println("Numero de letras encontradas: " + a.getLetrasEncontradas());
        System.out.println("Numero de letras faltantes: " + (a.getPalabraABuscar().length - a.getLetrasEncontradas()));
        
        // definiendo la variable de retorno
        if (cont>0 ) {
            return true;
        } else {
            return false;
        }
    }
    
    //Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
    public void mostrarIntentos(Ahorcado a){
        System.out.println("Le quedan " + a.getCantidadJugadasMaximas());
           
    }
    
//    Método juego(): el método juego se encargará de llamar todos los métodos previamente mencionados e 
//            informará cuando el usuario descubra toda la palabra o se quede sin intentos. 
//            Este método se llamará en el main.
    
    public void juego (){
        String letra;
        Ahorcado a = crearJuego();
        do {
            mostrarLongitud(a);
            System.out.println("Que letra desea buscar");
            letra = sc.next();
            buscarLetra(a,letra);
            boolean intentos = letrasEncontradas(a,letra);
            if (!intentos) {
                a.setCantidadJugadasMaximas(a.getCantidadJugadasMaximas()-1); 
            }
            mostrarIntentos(a);
        } while (a.getCantidadJugadasMaximas()>0);
        
    }
}
    */
    /*
    public class Ahorcado {
    private String [] palabraABuscar;
    private int letrasEncontradas;
    private int cantidadJugadasMaximas;

    public Ahorcado(String[] palabraABuscar,  int cantidadJugadasMaximas) {
        this.palabraABuscar = palabraABuscar;
        this.cantidadJugadasMaximas = cantidadJugadasMaximas;
    }

    
    public Ahorcado() {
    }

    public String[] getPalabraABuscar() {
        return palabraABuscar;
    }

    public void setPalabraABuscar(String[] palabraABuscar) {
        this.palabraABuscar = palabraABuscar;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getCantidadJugadasMaximas() {
        return cantidadJugadasMaximas;
    }

    public void setCantidadJugadasMaximas(int cantidadJugadasMaximas) {
        this.cantidadJugadasMaximas = cantidadJugadasMaximas;
    }
    
    
}
    */
}
/*

*/