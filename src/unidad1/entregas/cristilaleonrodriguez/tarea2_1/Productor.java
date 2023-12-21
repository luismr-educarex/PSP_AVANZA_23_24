/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad1.entregas.cristilaleonrodriguez.tarea2_1;


import java.util.logging.Level;
import java.util.logging.Logger;

public class Productor extends Thread {

    // REFERENCIA A UN OBJETO DE TIPO BUFFER COMPARTIDO ENTRE EL PRODUCTOR Y CONSUMIDOR
    private Buffer buffer;
    
    // CADENA DE LETRAS QUE EL PRODUCTOR UTILIZARÁ PARA GENERAR CARÁCTERES ALEATORIAMENTE
    private final String letras = "abcdefghijklmnopqrstuvxyz";
    
    // CONTADOR  DE CUANTO CARÁCTERES HA PRODUCIDO EL PRODUCTOR
    private int contador;
    
    // DEFINE EL LÍMITE DE LA PRODUCCIÓN
    private final int LIMIT = 15;
    
    
    /*
       Constructor que recibe una instancia de la clase Buffer como parámetro. Establece el búfer y inicializa el contador produced en cero.
    */
    
    public Productor(Buffer buffer){
        this.contador = 0;
        this.buffer = buffer;
    }
    
    public void run(){
        
        // Bucle que se ejecuta mientras el número de caracteres producidos sea menor que el límite establecido.
        while(contador < LIMIT){
            
            try {
                
                //  Genera un carácter aleatorio seleccionando una letra de la cadena letras
                char c = letras.charAt((int)(Math.random() * letras.length()));
                
                /// Llama al método producir(c) del objeto buffer
                buffer.producir(c);
                
                //  Incrementa el contador de caracteres producidos
                contador++;
                
                System.out.println("Depositado el caracter " + c + " del buffer");
                
                //  Simular cierto tiempo de producción antes de intentar producir el siguiente carácter
                sleep((int) (Math.random() * 1000));
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }

}
