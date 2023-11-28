
package unidad1.entregas.pinero_lucas_rocio;

import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;


public class lenguaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         try {
            if (args.length != 2) {
                System.out.println("Se introducen 2 argumentos");
            }

            try {
                FileLock bloqueo = null;
                int caracter = Integer.parseInt(args[0]);
                try {
                    String ruta = args[1].replace("\\", "\\\\");
                    //Creamos el fichero
                    File fich = new File(ruta);
                    if (!fich.exists()) {
                        System.out.println("Creando fichero");
                        fich.createNewFile();
                    }
                    String palabra = "";
                    RandomAccessFile rf = new RandomAccessFile(fich, "rwd");
                    bloqueo = rf.getChannel().lock();
                    rf.seek(fich.length());
                    for (int i = 0; i < caracter; i++) {
                        for (int j = 0; j < caracter; j++) {
                            //Generamos el caracter aleatorio
                            int letra = (int) Math.floor(Math.random() * (122
                                    - 97) + 97);
                            palabra = palabra + (char) letra;
                        }
                        rf.writeChars(palabra + "\n");
                        System.out.println(palabra);
                        palabra = "";
                    }
                    bloqueo.release();
                    bloqueo = null;
                    rf.close();

                } catch (Exception e) {
                    System.out.println("Debe introducir la ruta");
                }

            } catch (NumberFormatException e) {
                System.out.println("Debe introducir un número");
            }
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("Faltan parametro por rellenar");
        }

    }

}
