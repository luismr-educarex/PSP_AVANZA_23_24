/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad1.entregas.cristilaleonrodriguez.tarea2_1;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Consumidor extends Thread {
    
    private Buffer buffer;
    private int consumed;
    
    // DEFINE EL LÍMITE DE LA PRODUCCIÓN
    private final int LIMIT = 15;
    
    public Consumidor(Buffer buffer){
        this.consumed = 0;
        this.buffer = buffer;
    }
    
    public void run(){
        while(consumed < LIMIT){
            
            try {
                char c = buffer.consumir();
                consumed++;
                System.out.println("Recogido el caracter " + c + " del buffer");
                 sleep((int) (100 * Math.random()));
            } catch (InterruptedException ex) {
                Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
}