/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad1.entregas.sanchez_toribio_fernando;

import java.util.Random;
import static javax.management.Query.match;

/**
 *
 * @author Equipo
 */
public class NumerosAleatorios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
                            int numerosAleatorios= 40; // en la variable entera indicamos la cantidad de numeros a generar
                            
                            for (int i = 0; i <numerosAleatorios ; i++) {
                                        System.out.print(generanumero(0,100) +" ");
                              }
          
        }
                      public static int generanumero( int maximo , int minimo){
                             
                           int num=(int) (Math.random()*(maximo-minimo+1)+(minimo));
                            return num;
                            
                        }
    
    
    }
    

