/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad1.entregas.antonio_jesus_rosa.ordenarnumeros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author anton
 */
public class OrdenarNumeros {

     

    public static void main(String[] args) {
        
        ArrayList <Integer> al = new ArrayList<>();
        //Obtener datos de entrada del sistema
        InputStreamReader entrada = new InputStreamReader (System.in);
        //Almacenar los datos de la entrada
        BufferedReader br = new BufferedReader (entrada);
        
        //Guardar las líneas en una cadena de texto
        String linea;
        try {
            //Mientras lo leído no sea nulo
            while((linea = br.readLine())!=null){
                //Guardamos los datos en una colección
                al.add(Integer.parseInt(linea));
            }
        } catch (IOException ex) {
            System.out.println("Error al procesar los datos " +ex);
        }
        //cerrar el flujo de datos
        finally{
            if(entrada != null){
                try {
                    entrada.close();
                } catch (IOException ex) {
                    System.out.println("No se ha podido cerrar la entrada" +ex);
                }
            }
        }
        //Ordenar la colección de menor a mayor
        Collections.sort(al);
        
        //Mostrar los datos de la colección
        for (int n : al){
            System.out.println(n);
        }
    }
        
        
    }


