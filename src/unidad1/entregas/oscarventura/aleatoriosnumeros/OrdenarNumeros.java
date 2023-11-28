/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad1.entregas.oscarventura.aleatoriosnumeros;

/**
 *
 * @author Oscar ventura
 */import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrdenarNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Ingresa numeros, si ingresas un valor no numerico, se parara ):");
        while (scanner.hasNextInt()) {
            int numero = scanner.nextInt();
            numeros.add(numero);
        }
        Collections.sort(numeros);
        System.out.println("Números en orden de menor a mayor:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}



