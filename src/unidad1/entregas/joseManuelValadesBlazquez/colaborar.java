/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad1.entregas.joseManuelValadesBlazquez;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jose
 */
public class colaborar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // tenemos un solo argumento
        //creamos un if, si recibimos un argumento entrara en el bucle si no imprime debe tener un parametro
        if (args.length == 1){
             try {
                    for(int i=1; i<=5; i++){
               
                    System.out.println("Lanzado el proceso: " + i);
                    
                    String comando = "java -jar lenguaje.jar "+ (i*15)+ " " + args[0];
                    System.out.println("Comando lanzado "+ comando);
                    
                    //Llamar a otro programa 
                    Runtime.getRuntime().exec(comando);
    
                    }
                    
                 // Nos genera un try catch con la excepcion IOException
                }catch (IOException ex) {
                    Logger.getLogger(colaborar.class.getName()).log(Level.SEVERE, null, ex);
                }catch (SecurityException ex){
                    System.out.println("Problema Seguridad" + ex.getMessage());
                }
 
            
        }else System.out.println("Debe tener 1 parametro");
    }
    
}
