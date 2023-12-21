
package unidad1.entregas.sanchez_toribio_fernando;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import static java.lang.System.in;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Equipo
 */
public class OrdenarNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        try {
            InputStreamReader entrada = new InputStreamReader(System.in);
            BufferedReader bf = new BufferedReader(entrada);            
            
            String teclado=null;
            
            while ((teclado=bf.readLine()) != null ) {
                
                String datos[] =  teclado.trim().split(" ") ; 
                int numeros[]= new int[datos.length];
                                                                                    
                 for (int i = 0; i < numeros.length; i++) {
                                        numeros[i]= Integer.parseInt(datos[i]);//parseamos los numero a a enteros
                }
           //cogemos los numeros y los metemos en un Array
                        Arrays.sort(numeros);
                                
                                for (int i = 0; i < numeros.length; i++) {
                    
                                        System.out.print(numeros[i]+ " ");
                }
                          System.out.println(" ");
                                }
            
        } catch (IOException ex) {
            Logger.getLogger(OrdenarNumeros.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }
    
}
