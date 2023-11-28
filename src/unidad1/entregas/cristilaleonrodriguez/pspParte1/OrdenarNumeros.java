/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad1.entregas.cristilaleonrodriguez.pspParte1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Cristina
 */
public class OrdenarNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
   
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Ingresa los números uno por uno o escribe 'salir' para terminar:");

        while (true) {
            
            // LEE LA ENTRADA DEL USUARIO Y ELIMINA CUALQUIER ESPACIO EN BLANCO CON TRIM.
            String aleatorio = scanner.nextLine().trim();
            
            // SE VERIFICA SI LA ENTRADA ES IGUAL A SALIR, IGNORANDO MAYÚSCULAS Y MINÚSCULAS
            if (aleatorio.equalsIgnoreCase("salir")) {
                
                break; // Salir del bucle si se ingresa "salir"
                
            } else {
                
                try {
                    
                    // SI LA ENTRADA ES UN NÚMERO SE CONVIERTE EN ENTERO Y SE AGREGA A LA LISTA
                    
                    int numero = Integer.parseInt(aleatorio);
                    
                    numeros.add(numero);
                    
                    // EN CASO CONTRARIO SALE LA EXCEPCIÓN DE ERROR
                    
                } catch (NumberFormatException e) {
                    
                    System.out.println("Entrada no válida. Ingresa un número entero o 'salir' para finalizar.");
                }
            }
        }

        // Ordenar la lista de números
        Collections.sort(numeros);

        // Mostrar la lista ordenada
        System.out.println("Números ordenados:");
        
        for (int numero : numeros) {
            System.out.println(numero);
        }    }
    
}
