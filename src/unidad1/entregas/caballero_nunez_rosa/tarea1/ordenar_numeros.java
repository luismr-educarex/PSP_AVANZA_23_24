/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad1.entregas.caballero_nunez_rosa.tarea1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FA507
 */
public class ordenar_numeros {

    public static void main(String[] args){
       try{ 
           
        InputStreamReader isr =new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(isr);
        
       String teclado = null;
       while ((teclado = bf.readLine())!= null){
               
               String datos[] = teclado.split(" ");
               int numeros[] = new int[datos.length];
               for (int i = 0; i <  numeros.length; i++)
               {
                   numeros[i] = Integer.parseInt(datos[i]);
               }
                   Arrays.sort(numeros);
                   for (int i = 0; i < numeros.length; i++){
                   System.out.print(numeros[i] + " ");
                   }
               System.out.println(" ");
       } 
       }catch (IOException ex){
    Logger.getLogger(ordenar_numeros.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    } 
    
}
