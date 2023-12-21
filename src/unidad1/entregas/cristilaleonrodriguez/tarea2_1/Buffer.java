/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad1.entregas.cristilaleonrodriguez.tarea2_1;

import java.util.logging.Level;
import java.util.logging.Logger;

// Parte de la implementación del búfer compartido utilizado en un problema de productor-consumidor

public class Buffer {
 
    private char[] buffer;
    private int siguiente;
    private boolean estaLlena;
    private boolean estaVacia;
    
    public Buffer(int tamanio){
        this.buffer = new char[tamanio];
        this.siguiente = 0;
        this.estaLlena = false;
        this.estaVacia = true;
    }
    
    
    // synchronized, lo que significa que solo un hilo puede ejecutarlo a la vez. 
    public synchronized char consumir(){
        
        while(this.estaVacia){
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Buffer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        // Indica la posición del próximo carácter a ser consumido en el búfer.
        this.siguiente--;
        
        //  Marca el búfer como no lleno, ya que se acaba de consumir un carácter.
        this.estaLlena = false;
        
        // Si this.siguiente llega a cero después de la operación de decremento, significa que el búfer está vacío, y this.estaVacia se establece en verdadero.
        if(this.siguiente == 0){
            this.estaVacia = true;
        }
        
        // Notifica a todos los hilos que están en espera
        notifyAll();
        
        //  Retorna el carácter consumido desde la posición actual del índice this.siguiente en el búfer.
        return this.buffer[this.siguiente];
        
    }
    
    public synchronized void producir(char c){
        
        // Utiliza un bucle while para esperar hasta que haya espacio disponible en el búfer para producir
        while(this.estaLlena){
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Buffer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        //  Coloca el carácter producido (c) en la posición actual del índice this.siguiente en el búfer.
        this.buffer[this.siguiente] = c;
        
        this.siguiente++;
        
        // Marca el búfer como no vacío, ya que se acaba de producir un carácter.
        this.estaVacia = false;
        
        // Si this.siguiente alcanza la longitud máxima del búfer, se marca el búfer como lleno 
        if(this.siguiente == this.buffer.length){
            this.estaLlena = true;
        }
        
        //Notifica a todos los hilos que están en espera (posiblemente en el método consumir()) que ahora hay un cambio en el estado del búfer, y pueden verificar si pueden proceder.
        notifyAll();
        
    }
    
}

