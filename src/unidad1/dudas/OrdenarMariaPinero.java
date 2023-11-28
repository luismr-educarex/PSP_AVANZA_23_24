package unidad1.dudas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class OrdenarMariaPinero {

	public static void main(String[] args) {

        //Para introducir los numeros

        InputStreamReader sc = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(sc);

        try {

            String num = null;

            while ((num = bf.readLine()) != null) {

                //Lo creamos en un arrays       
                String datos[] = num.split(" ");
                int numeros[] = new int[datos.length];

                //Lo tenemos que parsear porque lo que vamos a introducir nos int

                for (int i = 0; i < numeros.length; i++) {
                    numeros[i] = Integer.parseInt(datos[i]);
              }

                //Los ordenamos 
                Arrays.sort(numeros);
               //Lo mostramos por pantalla

                for (int i = 0; i < numeros.length; i++) {
                    System.out.println(numeros[i]);
                }
            }

        } catch (IOException e) {

        }

    }
}
