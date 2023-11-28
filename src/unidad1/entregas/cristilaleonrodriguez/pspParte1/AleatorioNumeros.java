/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad1.entregas.cristilaleonrodriguez.pspParte1;

import java.util.Random;

public class AleatorioNumeros {

  
    public static void main(String[] args) {
       
             
            // CREAMOS UN OBJETO RANDOM PARA GENERAR NÚMEROS ALEATORIOS
        
        Random rnd = new Random();
        
        //GENERAMOS 40 NÚMEROS ALEATORIOS Y LOS MOSTRAMOS POR PANTALLA CON EL BUCLE FOR
        
        for (int i = 0; i < 40; i++) {
            
            // GENERAMOS NUMEROS DE 1 Y 100
            
             int numeroAleatorio = rnd.nextInt(100) + 1; 
             
             
            System.out.println("Número aleatorio " + (i + 1) + ": " + numeroAleatorio);
        }
    }
    
}
