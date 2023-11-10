
package unidad1.entregas.antonio_jesus_rosa.colaborar;

import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;


public class Colaborar {

  
    public static void main(String[] args) throws IOException {
        
   if(args.length==1){
       for (int i = 1; i <= 5; i++) {
                System.out.println("Proceso" + i);
                String comando = "java -jar lenguaje.jar "+ (i)+" "+args[0];
                System.out.println("Comando lanzado " +comando);
                Runtime.getRuntime().exec(comando);
            }
   }
  
  

    }
}
