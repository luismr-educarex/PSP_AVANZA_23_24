
package unidad1.entregas.sanchez_toribio_fernando;

import java.io.IOException;
import static java.lang.Compiler.command;
import java.util.jar.JarFile;


public class Colaborar {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        
        
                        String numeroveces=args[0];
                        String direccionfichero=args[1];
        
                        try{
                            
                              int numero=Integer.parseInt(numeroveces);
                       
                       
                       for (int i = 0; i <= numero; i++) {
                           
                           String letras =  i +"";
                      Process p =    Runtime.getRuntime().exec( "java -jar lenguaje.jar  " +  "  " + letras+ "  " + direccionfichero);
                           
                           p.waitFor();
                       }   
                        
                        }catch(NumberFormatException e){
                            
                         System.out.println("el primer argumento tiene que ser un numero");
                        }catch(IOException e){
                            System.out.println("Error de entrada o de salida");
                        }catch(InterruptedException e){
                            System.out.println("Error al esperar que termine el proceso");
                        }
                       
                       
                        }
    }
    

