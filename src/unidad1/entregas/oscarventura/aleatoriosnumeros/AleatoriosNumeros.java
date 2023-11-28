/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad1.entregas.oscarventura.aleatoriosnumeros;

import java.util.Random;

/**
 *
 * @author Oscar ventura
 */
public class AleatoriosNumeros {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random random =new Random ();
        for (int i=0; i < 40; i++){
            int numeroAleatorio = random.nextInt(100) + 1;
            System.out.println(numeroAleatorio);
        }
    }
    
}