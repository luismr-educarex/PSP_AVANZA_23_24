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
public class Productor extends Thread { // Extiende de Thread
    
    private final Buffer buffer; // Declaramos un buffer
    private final String caracter = "abcdefghijklmnopqrstuvwxyz"; // Creamos 
    // un string con las letras del abecedario, excepto la ñ
    private int producido; // Creamos una varible de tipo int para usar de contador
    private final int MAXCARACTER = 15; // Creamos una variable de tipo int y final
    // para indicar el número de caracteres maximos a crear (15 según indica el ejercicio)
    
    // Creamos el constructor
    public Productor (Buffer buffer){
        this.producido = 0;
        this.buffer = buffer; 
    }
    
    // Sobreescribimos el método run
    @Override
    public void run(){
        while(producido < MAXCARACTER){ // Mientras producido sea menor al maximo... 
            try{
            // Generamos un caracter de forma aleatoria y lo guardamos en c
            char c = caracter.charAt((int)(Math.random() * caracter.length()));
            buffer.producir(c); // Le pasamos al buffer, a traves del método producir,
            // el caracter producido
            producido++; // Aumentamos en uno la variable producido
            System.out.println("El caracter " + c + " ha sido depositado en el buffer");
            // Mostramos por consola el caracter producido
            sleep ((int) (Math.random() * 100)); // Dormimos el hilo el tiempo indicado
            // en el ejercicio
            } catch (InterruptedException ex) {
                Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
