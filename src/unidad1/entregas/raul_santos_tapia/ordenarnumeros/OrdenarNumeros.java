/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad1.entregas.raul_santos_tapia.ordenarnumeros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author rstap
 */
public class OrdenarNumeros {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		System.out.print("Introduzca el total de numeros que desea ingresar: ");
		int totNum = leer.nextInt();
		int[] num = new int[totNum];
		System.out.println("Introduzca " + totNum + " numero(s): ");
		for (int i = 0; i < num.length; i++) {
			System.out.print("Numero " + (i + 1) + ": ");
			num[i] = leer.nextInt();
		}
		System.out.println("\nLos numeros ingresados SIN ORDENAR son: ");
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

		Arrays.sort(num);

		System.out.println("Numeros ordenados: " + Arrays.toString(num));

		// Vamos a leer de la entrada estándar del proceso y escribir
		// los datos que se reciben en la salida estándar del proceso
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(isr);
		// Obtenemos el stream de lectura de la entrada estándar
		// utilizamos un lector con Buffered, para no perder ningún dato
		String lineaTeclado = null;
		try {
			System.out.println("Proceso lector");
			// Mostramos que el proceso que está escribiendo es el que está
			// leyendo los datos.
			while ((lineaTeclado = bf.readLine()) != null) {
				// Vamos leyendo y mostrando los datos
				System.out.println(lineaTeclado);
			}
		} catch (IOException ex) {
			System.err.println("Se ha producido un error de E/S.");
			System.err.println(ex.toString());
		}

	}

}
