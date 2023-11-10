package unidad1.dudas;

import java.util.Arrays;
import java.util.Scanner;

public class OrdenacionJoseManuelValades {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String teclado = null;

		while ((teclado = entrada.next()) != null) {

			String[] datos = teclado.split(" ");

			int[] numeros = new int[datos.length];

			for (int i = 0; i < numeros.length; i++) {

				numeros[i] = Integer.parseInt(datos[i]);
			}

			Arrays.sort(numeros);

			for (int i = 0; i < numeros.length; i++) {

				System.out.print(numeros[i] + " ");
			}

			System.out.print("");

		}
	}
}
