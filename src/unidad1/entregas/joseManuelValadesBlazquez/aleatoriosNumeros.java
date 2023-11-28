/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad1.entregas.joseManuelValadesBlazquez;


import java.util.Random;


/**
 *
 * @author Jose
 */
public class aleatoriosNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Random rd = new Random();
        int[] numerosAleatorios=new int[40];
       
        
        for(int i=0; i<numerosAleatorios.length; i++){
            
            numerosAleatorios[i]=rd.nextInt(100)+1;
            
        }
        for (int numerosGenerados: numerosAleatorios){
            
            System.out.print(numerosGenerados + " ");
        }
    }
    
}
