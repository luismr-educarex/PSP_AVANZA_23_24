/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad1.entregas.roman_marguez_gonzalo.aleatoriosnumeros;

import java.util.Random;

/**
 *
 * @author Gonzalo Román
 */
public class AleatoriosNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random random = new Random();

        int numeroAleatorio = 0;
        String cadenaNumeros ="";
        for (int i = 0; i < 40; i++) {
             numeroAleatorio = random.nextInt(100) + 1; 
             cadenaNumeros += numeroAleatorio+" ";
        }
        
         System.out.print(cadenaNumeros);
    }
    
}
