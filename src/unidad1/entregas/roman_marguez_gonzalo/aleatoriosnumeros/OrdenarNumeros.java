/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad1.entregas.roman_marguez_gonzalo.aleatoriosnumeros;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Gonzalo Román
 */
public class OrdenarNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        String numeros;
        numeros = teclado.nextLine();
        // System.out.println(numeros);
        String numerosSeparados[] = numeros.split(" ");
        int irt = numerosSeparados.length;
        int[] numerosInt = new int[irt];

        for (int i = 0; i < numerosSeparados.length; i++) {
            // System.out.println(numerosSeparados[i]);
            numerosInt[i] = Integer.parseInt(numerosSeparados[i]);
        }
        Arrays.sort(numerosInt);
        for (int i = 0; i < numerosInt.length; i++) {
            // System.out.println(numerosSeparados[i]);
            System.out.print(numerosInt[i] + " ");
        }

    }

}
