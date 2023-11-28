/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad2.tarea1.entregas.carrasco_castanares_diego_manuel;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author diego
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Buffer b = new Buffer(6); // Creamos un buffer con capacidad 
        // máxima de 6
        Productor p = new Productor (b); // Creamos un productor con el 
        // valor del buffer
        Consumidor c = new Consumidor (b); // Creamos un consumidor con el
        // valor del buffer
        p.start(); // Arrancamos el hilo productor
        c.start(); // Arrancamos el hilo consumidor
        try {
            p.join(); // Usamos el join para que empiece en el orden indicado (en
            // este caso el productor primero)
            System.out.println("El hilo productor ha finalizado"); // Mostramos
            // por consola cuando el hilo productor finaliza
            c.join(); // Usamos el join para que empeice en el orden indicado (en
            // estre caso el consumidor productor segundo)
            System.out.println("El hilo consumidor ha finalizado"); // Mostramos
            // por consola cuando el hilo conductor ha finalizado
            
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
