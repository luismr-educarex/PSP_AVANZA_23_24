/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad1.entregas.caballero_nunez_rosa;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FA507
 */
public class colaborar {

    
    public static void main(String[] args) {
        if(args.length == 1){
             try {
            for(int i = 1; i <= 5; i++){
                
                System.out.println("Comenzando proceso: " + i);
                
                String comando = "java -jar lenguaje.jar " + (i) + " " + args[0];
                System.out.println("Lanzando comando " + comando);
                
               
                    Runtime.getRuntime().exec(comando);
                } 
            }catch(SecurityException ex){
            System.out.println("Problema de seguridad: " + ex.getMessage());
            } 
             
             catch (IOException ex) {
                    Logger.getLogger(colaborar.class.getName()).log(Level.SEVERE, null, ex);
                }
        }else{
                
         System.out.println("Se deben establecer un parametro");
                
                }
        }
    }
    

