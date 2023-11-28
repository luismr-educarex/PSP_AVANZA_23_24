/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad1.entregas.irenecaraballomolina;

/**
 *
 * @author iren
 */
import java.util.Random;

public class aleatoriosNumeros {
    public static void main(String[] args) {
       
        Random rand = new Random();
        
        for (int i = 0; i < 40; i++) {
            int numeroAleatorio = rand.nextInt(100) + 1; 
            System.out.println(numeroAleatorio);
        }
    }
}
