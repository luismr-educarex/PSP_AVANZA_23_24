package unidad1.dudas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class OrdenacionEnteros {

	public static void main(String[] args) {
		
		 ArrayList<Integer> numeros = new ArrayList<>();
		 numeros.add(23);
		 numeros.add(2);
		 numeros.add(97);
		 numeros.add(56);
		 numeros.add(11);
		 numeros.add(38);
		 
		Collections.sort(numeros);
		
		 // Se muestran por pantalla los números ordenados
        System.out.println("La secuencia ordenada de números aleatorios es esta: \n");
        for(int i=0; i < numeros.size(); i++){
            System.out.print(numeros.get(i) + " ");
        }

	}

}
