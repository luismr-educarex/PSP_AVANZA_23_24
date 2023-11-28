
package unidad1.entregas.pinero_lucas_rocio;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Colaborar {

    public static void main(String[] args) {
       if(args.length == 1) {
          try {  
           for (int i = 1; i < 16; i++) {
              
                   System.out.println("Lanzado el proceso: " + 1);
                   
                   String com = "java -jar lenguaje.jar" + (i * 1) + " " + args[0];
                   System.out.println("Comando lanzado" + com);
                   
                   Runtime.getRuntime().exec(com);
           }
               } catch(SecurityException e){
                  System.out.println("Para posibles problemas de seguridad" + e.getMessage()); 
        
               }catch (IOException ex) {
                   Logger.getLogger(Colaborar.class.getName()).log(Level.SEVERE, null, ex);
               
               
           }
  
           
       
       }else{
           System.out.println("Debe tener un parametro");
       }
    }
    
}
