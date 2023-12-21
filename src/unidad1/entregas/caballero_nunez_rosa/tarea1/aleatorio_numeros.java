/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad1.entregas.caballero_nunez_rosa.tarea1;

/**
 *
 * @author FA507
 */
public class aleatorio_numeros {

    public static void main(String[] args) {
         int numerosGenerados = 40;
         
       for (int i = 0; i < numerosGenerados; i++) {
       System.out.print(generarNumeroAleatorio(0,100) + " ");
       }  
    }
    
   public static int generarNumeroAleatorio(int minimo, int maximo){
   int num=(int)(Math.random()*(maximo-minimo+1)+(minimo));
   return num;
   } 
    
    
}
