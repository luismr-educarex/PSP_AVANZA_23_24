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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ordenarNumeros {
    public static void main(String[] args) {
        // Utilizamos un stream para leer los números
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(isr);

        try {
            // Leemos la línea de la tubería
            String input = bf.readLine();

            // Dividimos la línea en números
            String[] numerosStr = input.split(" ");

            // Convertimos los números a enteros
            int[] numeros = new int[numerosStr.length];
            for (int i = 0; i < numerosStr.length; i++) {
                numeros[i] = Integer.parseInt(numerosStr[i]);
            }

            // Ordenamos los números
            ordenarNumeros(numeros);

            // Mostramos los números ordenados
            System.out.println("Números ordenados:");
            for (int numero : numeros) {
                System.out.print(numero + " ");
            }
        } catch (IOException | NumberFormatException ex) {
            System.err.println("Error al leer los números: " + ex.getMessage());
        }
    }

    public static void ordenarNumeros(int[] numeros) {
        int n = numeros.length;
        boolean intercambio;
        do {
            intercambio = false;
            for (int i = 1; i < n; i++) {
                if (numeros[i - 1] > numeros[i]) {
                    int temp = numeros[i - 1];
                    numeros[i - 1] = numeros[i];
                    numeros[i] = temp;
                    intercambio = true;
                }
            }
        } while (intercambio);
    }
}
