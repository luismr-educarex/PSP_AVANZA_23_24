package unidad1.dudas;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Aleatorios {
    public static void main(String[] args) {
        Random rand = new Random();
        Set<Integer> numerosGenerados = new HashSet<>();
        int cantidadNumeros = 10; // Puedes ajustar la cantidad de números que deseas generar

        while (numerosGenerados.size() < cantidadNumeros) {
            int numeroAleatorio = rand.nextInt(100) + 1; // Generar un número aleatorio
            numerosGenerados.add(numeroAleatorio); // Agregarlo al conjunto
        }

        // Imprimir los números aleatorios generados sin repetir
        System.out.println("Números aleatorios del 1 al 100 sin repetir:");
        for (int numero : numerosGenerados) {
            System.out.println(numero);
        }
    }
}

