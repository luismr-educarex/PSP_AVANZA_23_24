
package unidad1.entregas.pinero_lucas_rocio;

import java.util.Random;


public class aleatoriosNumeros {

    public static void main(String[] args) {
       //Creamos un objeto Random
        Random rn = new Random();

        int i;
        // recorremos e impromimos en pantalla con un for   
        for (i = 0; i < 40; i++) {
            System.out.println( rn.nextInt(101));
        }
    }
    
}
