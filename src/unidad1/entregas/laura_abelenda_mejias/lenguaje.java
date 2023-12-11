package unidad1.entregas.laura_abelenda_mejias;


import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
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

public class lenguaje {
    public static void main(String[] args){
        //Creamos variables
        String letras = "abcdefghijklmnopqrstuvwxyz";
        String nombreFichero;
        FileLock bloqueo = null;

        if (args.length == 2) {
            try {
                int numLineas = Integer.parseInt(args[0]);
                String osName = System.getProperty("os.name");
                if (osName.toUpperCase().contains("WIN")) {
                    nombreFichero = args[1].replace("\\", "\\\\");
                } else {
                    nombreFichero = args[1];
                }
                File archivo = new File(nombreFichero);
                if (!archivo.exists()) {
                    archivo.createNewFile();
                }
                RandomAccessFile raf = new RandomAccessFile(archivo, "rwd");
                bloqueo = raf.getChannel().lock();
                raf.seek(archivo.length());               
                for (int i = 0; i < numLineas; i++) {
                    String linea = "";
                    int numCaracteres = numLineas;
                    for (int j = 0; j < numCaracteres; j++) {
                        linea += letras.charAt(generaNumeroAleatorio(0, letras.length() - 1));
                    }
                    raf.writeChars(linea + "\n");
                }
                bloqueo.release();
                bloqueo = null;
                raf.close();
            } catch (IOException ex) {
                Logger.getLogger(lenguaje.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("El programa debe tener dos parametros");
        }
    }

    public static int generaNumeroAleatorio(int minimo, int maximo) {
        int num = (int) (Math.random() * (maximo - minimo + 1) + (minimo));
        return num;     
    }  
}


