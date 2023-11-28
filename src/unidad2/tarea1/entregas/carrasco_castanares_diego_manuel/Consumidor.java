/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad2.tarea1.entregas.carrasco_castanares_diego_manuel;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author diego
 */
public class Consumidor extends Thread { // Extiende de Thread

    private final Buffer buffer; // Declaramos un buffer
    private int consumido; // Declaramos una variable para usar de contador
    private final int MAXCARACTER = 15; // Declaramos una variable para indicar 
    // el maximo de caracteres, que será 15 según indica el ejercicio

    // Cremaos el método constructor
    public Consumidor(Buffer buffer) {

        this.consumido = 0;
        this.buffer = buffer;

    }

    // Sobreescribimos el método run
    @Override
    public void run() {
        while (consumido < MAXCARACTER) { // Mientras que lo que consumimos sea
            // menos al máximo...
            try {
                char c = buffer.consumir(); // ... llamamos al método consumir de
                // la clase buffer y guardamos el retorno
                consumido++; // Aumentamos la variable consuido en uno
                System.out.println("El caracter " + c + " ha sido recogido del buffer");
                // Indicamos el caracter que hemos consumido
                sleep((int) (Math.random() * 1000)); // Dormimos el hilo el tiempo
                //indicado en el ejercicio
            } catch (InterruptedException ex) {
                Logger.getLogger(Consumidor.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

}
