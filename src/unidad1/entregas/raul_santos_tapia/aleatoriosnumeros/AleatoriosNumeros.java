/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad1.entregas.raul_santos_tapia.aleatoriosnumeros;

/**
 *
 * @author rstap
 */
public class AleatoriosNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        int Numero;
        //Mediante un bucle for, contamos hasta llegar a 40 números aleatorios (variable i<=40) entre el 1 y el 100 (método random*100
        for (int i=1; i<=40;i++){
            //almacenamos la salida en la variable "Numero"
        Numero=(int)(Math.random()*100);
        //salida por pantalla de la variable que almacena
            System.out.println(Numero);
                                } 
    }
    
}
