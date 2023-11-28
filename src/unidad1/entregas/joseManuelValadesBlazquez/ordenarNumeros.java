/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad1.entregas.joseManuelValadesBlazquez;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Jose
 */
public class ordenarNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        try {
            
            InputStreamReader entrada= new InputStreamReader(System.in);
            BufferedReader in= new BufferedReader(entrada);
            String teclado=null;
            teclado=in.readLine();
            while (teclado!= null ){
                
                String [] datos=teclado.split(" "); 
                int [] numeros=new int[datos.length];
                for (int i = 0; i <numeros.length; i++) {
                    
                    numeros[i]=Integer.parseInt(datos[i]);
                    
                }
                Arrays.sort(numeros);
                
                for (int i = 0; i <numeros.length; i++) {
                    
                    System.out.print(numeros[i]+ " ");
                }
                
                
            }
        
        } catch (IOException ex) {
            Logger.getLogger(ordenarNumeros.class.getName()).log(Level.SEVERE, null, ex);
        }
   
        
    }
}
 
