package unidad1.entregas.sanchez_toribio_fernando;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Lenguaje {

    public static void main(String[] args) throws IOException {
        
                    if(args.length< 2){  // avisamos al usuario si falta algun argumento , 
                        System.out.println("Se requieren 2 argumentos numero de repeticiones y nombre de archivo");
                        return;
                    }
        
                     String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; // variable para generar las palabras
                     
                    File ruta = new File(args[1]);// segundo argumento nombre de documento a generar
                    int numeroderepeticiones =Integer.parseInt(args[0]);// primer argumento a pedir numero de veces ...
                    
                    
                    BufferedWriter escritor = new BufferedWriter(new FileWriter(ruta,true));// buffer para escribir 
                    
                    int numeroaleatorio = 0;
                    Random aleatorio = new Random();
                    
                 for (int j = 0; j < numeroderepeticiones; j++) { // bucle para repetir numero de letras

                 for (int i = 0; i < numeroderepeticiones; i++) {// bucle para repetir cadena de letras

                numeroaleatorio = aleatorio.nextInt(25);
                
                escritor.write(alfabeto.charAt(numeroaleatorio));// escribe el numero aleatorio
            }
                 escritor.write(" ");
        }

        escritor.newLine();//agregamos un espacio despues de escribir
        
        escritor.close();// cerramos el flujo de escritura
    }
}
