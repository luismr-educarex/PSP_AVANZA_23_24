/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad1.entregas.raul_santos_tapia.colaborar;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rstap
 */
public class Colaborar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        if (args.length == 1) {
            try {
                for (int i = 1; i <= 5; i++) {

                    
                    // Creamos una variable de tipo Strign, la cual contendrá el comando a ejecutar y le pasamos como argumento el fichero
                    String comando = "java -jar Lenguaje.jar " + (i + 1) + " " + args[0];
                    

                    //Ejecutamos el comando
                    Runtime.getRuntime().exec(comando);

                }
            } catch (IOException ex) {
                Logger.getLogger(Colaborar.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            System.out.println("Hay que pasarle 1 argumento");
        }

    }

}
