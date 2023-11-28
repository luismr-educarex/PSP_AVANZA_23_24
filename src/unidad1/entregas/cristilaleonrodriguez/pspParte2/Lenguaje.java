/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad1.entregas.cristilaleonrodriguez.pspParte2;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;


import java.util.Scanner;


public class Lenguaje {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Indica el nombre del fichero:");
        String nombreFichero = sc.nextLine();

        System.out.println("Indica la cantidad de letras:");
        int cantidadLetras = sc.nextInt();

        try {

            File file = new File("./" + nombreFichero);

            // Si el archivo no existe lo creamos
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            

            String palabra = "";
            
            //Recorremos un for por el numero de filas y otro por el numero de caracteres por palabra.
            for(int i =0; i < cantidadLetras; i++){
                /*
                
                */
                
                for(int e =0; e < cantidadLetras; e++){
                    
                    // Genera una letra minúscula aleatoria del abecedario
                    char randomLetter = (char) ((int) (Math.random() * 26) + 'a');
                    palabra += randomLetter;
                }
               palabra+="\n";
            }
            
            // Escribimos las palabras en el archivo
            bw.write(palabra);
            
            bw.close();
            fw.close();
             
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

  
    }




    


