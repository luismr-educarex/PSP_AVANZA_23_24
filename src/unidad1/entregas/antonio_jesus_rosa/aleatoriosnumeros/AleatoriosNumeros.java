/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad1.entregas.antonio_jesus_rosa.aleatoriosnumeros;

/**
 *
 * @author anton
 */
public class AleatoriosNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int n;
       
       for(int i=0; i<=40; i++){
           n=(int) (Math.random()*100);
           System.out.println(n);
       }
        
    }
    
}
