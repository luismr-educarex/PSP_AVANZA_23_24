/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad1.entregas.raul_santos_tapia.lenguaje;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rstap
 */
public class Lenguaje {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {

        String letras = "abcdefghijklmnopqrstuvwxyz";
        String nombreFichero;
        FileLock bloqueo = null; //Variable que bloquea el fichero para que la siguiente vez que se ejecute se espere a desbloqueo

        //Comprobamos que el programa tiene 2 parámetros
        if (args.length == 2) {
            try { //controlamos posible error
                //convertimos a integer el string y definimos el numero de lineas que va a generar por teclado
                int numLineas = Integer.parseInt(args[0]);
                String osName = System.getProperty("os.name");
                //Comprobamos el sisteme operativo que tenemos para evitar errores con las rutas
                if (osName.toUpperCase().contains("WIN")) {
                    nombreFichero = args[1].replace("\\", "\\\\");
                } else {
                    nombreFichero = args[1];
                }
                //creamos objeto tipo File donde se almacenerá en la variable "archivo" el nombre del fichero
                File archivo = new File(nombreFichero);
                //Si no existe el fichero, lo creamos
                if (!archivo.exists()) {

                    archivo.createNewFile();

                }
                //Controlamos el bloqueo del fichero para lectur,escritura y actualización
                RandomAccessFile raf = new RandomAccessFile(archivo, "rwd");
                //cogemos el bloqueo
                bloqueo = raf.getChannel().lock();
                //nos posibionamos al final del fichero para seguir escribiendo
                raf.seek(archivo.length());
                
                for (int i = 0; i < numLineas; i++) {
                    String linea = "";
                    //llamamos a la funcion "generaNumeroAleatorio" y le decimos que escriba 5 letras aleatorias por el numero de lineas escritas en consola
                    int numCaracteres = generaNumeroAleatorio(5, 5);
                    for (int j = 0; j < numCaracteres; j++) {
                        linea += letras.charAt(generaNumeroAleatorio(0, letras.length() - 1));
                    }
                    //escribimos las lineas con retorno de carro
                    raf.writeChars(linea + "\n");
                }
               //liberamos el bloqueo para que el siguiente proceso lo coja
                bloqueo.release();
                bloqueo = null;
                raf.close();

            } catch (IOException ex) {
                Logger.getLogger(Lenguaje.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            System.out.println("el programa debe tener dos parametros");
        }

    }
          //funcion que genera números aleatorios pasándole como parámetro un mínimo de caracteres y un máximo.
    public static int generaNumeroAleatorio(int minimo, int maximo) {
        int num = (int) (Math.random() * (maximo - minimo + 1) + (minimo));
        return num;
    }

}