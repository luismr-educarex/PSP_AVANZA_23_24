/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad1.entregas.cristilaleonrodriguez.tarea2_1;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal {

    public static void main(String[] args) {
        
        try {
            Buffer b = new Buffer(6);
            Productor p = new Productor(b);
            Consumidor c = new Consumidor(b);
            
            // nicia el hilo del productor.
            p.start();
            
             // Hace que el hilo principal espere 1000 milisegundos (1 segundos). 
            Thread.sleep(1000);
            
            // Inicia el hilo del consumidor.
            c.start();
            
            //  Hace que el hilo principal espere hasta que el hilo del productor (p) termine su ejecución
            p.join();
            
            // Hace que el hilo principal espere hasta que el hilo del consumidor (c) termine su ejecución
            c.join();
            System.out.println("Termina el programa");
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
