
package unidad1.tarea.solucion.ejercicio1;



import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
public class OrdenarNumeros {


    public static void main(String[] args) {
        // Se crean las variables para captar la entrada de datos
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(reader);
        
        // Se inicializa la variable que almacenará el número entrante
        String num_entrada = null;
        // Se crea el arraylist que contendrá los números
        ArrayList<Integer> numeros = new ArrayList<>();
        
        //Se inicia el proceso de lectura de datos
        try{
            // bucle que sigue hasta que se acaban los datos de entrada
            while((num_entrada = buffer.readLine())!=null){
                numeros.add(Integer.parseInt(num_entrada));
            }
        }
        catch(IOException ex){
            System.err.println("Error de E/S");
            System.err.println(ex.toString());
        }
        // Se ordenan los números en el arraylist
        Collections.sort(numeros);
        
        // Se muestran por pantalla los números ordenados
        System.out.println("La secuencia ordenada de números aleatorios es esta: \n");
        for(int i=0; i < numeros.size(); i++){
            System.out.print(numeros.get(i) + " ");
        }
        
    }
    
}
