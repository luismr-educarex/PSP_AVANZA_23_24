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
 * @author Rosa Caballero Núñez
 */
public class Buffer {
    
    private char[] buffer;
    private int siguiente;
    private boolean llena;
    private boolean vacia;
    
    public Buffer(int tamanio){
    this.buffer = new char[tamanio];
    this.siguiente = 0;
    this.llena = false;
    this.vacia = true; 
    }
    
    public synchronized char consumir(){
        
        while(this.vacia){
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Buffer.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
 
   this.siguiente--;
   this.llena = false;
   
   if(this.siguiente == 0){
      this.vacia = true;
       
   }
   
   notifyAll();
   return this.buffer[this.siguiente];
    }
        
        
    public synchronized void producir(char c){
    
    while(this.llena){
    try{
    wait();
    }catch(InterruptedException ex){
    Logger.getLogger(Buffer.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    }
    this.buffer[this.siguiente] = c;
    
    this.siguiente++;
    this.vacia = false;
    
    if(this.siguiente == this.buffer.length){
    this.llena = true;
    }
    
    notifyAll();
    
    }
}
