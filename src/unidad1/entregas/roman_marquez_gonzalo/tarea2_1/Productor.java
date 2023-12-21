/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad1.entregas.roman_marquez_gonzalo.tarea2_1;

/**
 *
 * @author Gonzalo Román
 */
/*
La clase productor es un hilo que genera caracteres y los inserta en el buffer de caracteres
*/

public class Productor implements Runnable {

    private PilaSin pila; //declaramos varialbe pila, tipo PilaSin
    private int num;
    

    //Constructor donde recibimos el objeto PilaSin creado en el Main.
    public Productor(PilaSin s) { 
        pila = s; //guardamos el objeto PilaSin en pila
      
    }

    //metodo run
    public void run() {
        char c; //declaramos el caracter que vamos a pasar para que añada a la lista de caracteres
        for (int i = 0; i < 15; i++) {
           // System.out.println("recorrido del for" + i);
            c = (char) (Math.random() * 26 + 'a'); //crea un caracter aleatorio y lo guarda casteado en c
            pila.push(c); //llamamos al metodo push de la pila que es una instancia de Pilasin, y lo añade al buffer
            
            try {
                Thread.sleep((int) (Math.random() * 100)); //paramos el hilo un tiempo aleatorio
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //System.out.println("tamaño buffer:" + pila.buffer.size()); //imprimimos el tamaño del buffer
        }

    } // Fin del método run

} // Fin de la Clase Productor