package unidad1.entregas.laura_abelenda_mejias;


import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laura Abelenda
 */
public class colaborar {
    public static void main(String[] args) throws IOException {

        if (args.length == 1) {
            try {
                for (int i = 1; i <= 10; i++) {
                    System.out.println("Lanzado el proceso: " + i);
                    String comando = "java -jar lenguaje.jar " + (i * 5 ) + " " + args[0];
                    System.out.println("Comando lanzado " + comando);
                    Runtime.getRuntime().exec(comando);
                }
            } catch(SecurityException ex){
                System.out.println("Problema seguridad: " + ex.getMessage());
            } catch (IOException ex) {
                Logger.getLogger(colaborar.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("Debe tener 1 parametro");
        }
    }   
}
