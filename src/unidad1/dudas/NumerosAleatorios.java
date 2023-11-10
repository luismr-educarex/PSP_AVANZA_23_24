package unidad1.dudas;

import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        // Crear una instancia de la clase Random
        Random rand = new Random();

        
        int numeroAleatorio;

        for(int cantidad=0;cantidad<10;cantidad++) {
        	// Generar un número aleatorio en el rango del 1 al 100
        	numeroAleatorio = rand.nextInt(100) + 1;
        	// Imprimir el número aleatorio generado
            System.out.println("Número aleatorio del 1 al 100: " + numeroAleatorio);
        }
        
        
    }
}