package unidad1.entregas.roman_marquez_gonzalo.tarea2_1;

/**
 *
 * @author Gonzalo Román
 */
/*Esto lo que hace es sacar un elemento del buffer o Stack*/

public class Consumidor implements Runnable {

    private PilaSin pila; //declaramos varialbe pila, tipo PilaSin
    private int num;
  

   //Constructor donde recibimos el objeto PilaSin creado en el Main.
    public Consumidor(PilaSin s) {
        pila = s;
        
    }

    public void run() {
        char c; //declaramos el caracter que vamos a pasar para que añada a la lista de caracteres
        for (int i = 0; i < 15; i++) {
           
            c = pila.pop(); //llamamos al metodo pop de PilaSin y guardadmos el valor en c
            
            try {
                Thread.sleep((int) (1000 * Math.random())); //paramos un tiempo aleatorio
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
           // System.out.println("tamaño buffer:" + pila.buffer.size()); //imprimimos el tamaño del buffer
        }
    } // Fin del método run

} // Fin de la Clase Consumidor