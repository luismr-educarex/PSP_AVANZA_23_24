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
public class Buffer {

    /**
     * Crearemos el array de char llamado buffer, un int que se llamará next y
     * dos booleanos, uno llamado full y otro llamado empty que serán los
     * encargados de indicar si esta lleno o vacío el array
     */
    private final char[] buffer;
    private int next;
    private boolean full, empty;

    // Creamos el constructor
    public Buffer(int capacidad) {

        this.buffer = new char[capacidad]; // Creamos el array de char con la capidad que le pasamos
        this.next = 0; // Iniciamos a 0 el contador next
        this.full = false; // Inicialmente no esta lleno, lo iniciamos a false
        this.empty = true; // Inicialmente esta vacío, lo inicamos a true

    }

    // Creamos el método consumir, al ser una sección crítica usamos synchronized
    public synchronized char consumir() {

        while (this.empty) { // Si esta vacío le decimos que espere
            try {

                wait(); // Debe ir envuelto en try catch

            } catch (InterruptedException ex) {
                Logger.getLogger(Buffer.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        this.next--; // Vamos restando uno al contador para cada caracter consumido
        this.full = false; // Si consume, le indicamos que no esta lleno

        if (this.next == 0) { // Si el contador estan en 0 le indicamos que esta vacio.

            this.empty = true; // Por lo tanto empty es verdadero

        }

        notifyAll(); // Notificamos a todos los hilos que ha terminado de consumir
        return this.buffer[this.next]; // Retornamos al buffer el valor de la variable next

    }

    // Creamos el método producir, al ser una sección críticia usamos synchronized
    public synchronized void producir(char c) {

        while (this.full) { // Mientas este lleno...
            try {

                wait();

            } catch (InterruptedException ex) {
                Logger.getLogger(Buffer.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        this.buffer[this.next] = c; // Guardamos en el buffer el valor de c
        this.next++; // Aumentamos la variable next
        this.empty = false; // Si producimos no esta vacío

        if (this.next == this.buffer.length) { // Si la varibale next es igual a la capidad del buffer...

            this.full = true; // ... lleno es verdadero

        }

        notifyAll(); // Notificamos a todos los hilos que ha terminado de producir

    }

}
