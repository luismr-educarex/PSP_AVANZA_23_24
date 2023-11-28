package unidad1.entregas.pinero_lucas_rocio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class ordenarNumeros {

    public static void main(String[] args) {

        //Para introducir los numeros
        InputStreamReader sc = new InputStreamReader(System.in);

        BufferedReader bf = new BufferedReader(sc);
        String num = null;
        ArrayList<Integer> numeros = new ArrayList();

        try {
            while ((num = bf.readLine()) != null) {
                numeros.add(Integer.parseInt(num));

            }
            Collections.sort(numeros);
            for (int n : numeros) {
                System.out.println(n);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

/*OTRA MANERA MAS FACIL DE HACERLO

        Scanner sc = new Scanner(System.in);
       //Pedimos los numeros y los escribimos con el escaner
        System.out.print("Introduzca el total de numeros que desea ingresar: ");
        int totNum = sc.nextInt();
        //los guardamos en un array
        int[] num = new int[totNum];
        //Pedimos el ingreso de los números
        System.out.println( totNum);
        //Recorremos la estructura
        for(int i = 0; i < num.length; i++){
        System.out.print("Numero " + (i+1) + ": ");
        num[i] = sc.nextInt();
        }
        //Los ordenamos        
        Arrays.sort(num);
        
        System.out.println("\nLos numeros ingresados ORDENADOS ASCENDENTEMENTE son: ");
        for(int i = 0; i < num.length; i++){
        System.out.println(num[i]);
        }  */
