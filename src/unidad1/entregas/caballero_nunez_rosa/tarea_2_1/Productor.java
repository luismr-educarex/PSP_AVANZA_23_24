/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad1.entregas.caballero_nunez_rosa.tarea_2_1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FA507
 */
public class Productor extends Thread{
    
    private Buffer buffer;
    private final String letras = "abcdefghyjklmnopqrstuvwxyz";
    private int produced;
    private final int LIMIT = 15;
    
    public Productor(Buffer buffer){
    this.produced = 0;
    this.buffer = buffer;
    }
    
    public void run(){
    while(produced < LIMIT){
    
        try {
            char c = letras.charAt((int)(Math.random() * letras.length()));
            buffer.producir(c);
            produced++;
            System.out.println("Depositado el caracter " + c + " del buffer");
            sleep((int)(100*Math.random()));
        } catch (InterruptedException ex) {
            Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    }
    
}
