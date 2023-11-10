/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad1.entregas.antonio_jesus_rosa.lenguaje;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;

/**
 *
 * @author anton
 */
public class Lenguaje {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        FileLock bloqueo = null;
        int caracter = Integer.parseInt(args[0]);
        String ruta = "C:\\Users\\anton\\Desktop\\Ciclo\\Segundo\\Programación de Servicios y Procesos\\Tema 1\\texto.txt";
        //CREACIÓN DEL FICHERO .TXT
        File fichero = new File(ruta);
        if (!fichero.exists()) {
            System.out.println("Creando fichero");
            fichero.createNewFile();
        }
        String palabra = "";
        RandomAccessFile raf = new RandomAccessFile(fichero, "rwd");
        bloqueo = raf.getChannel().lock();
        raf.seek(fichero.length());
        for (int i = 0; i < caracter; i++) {
            for (int j = 0; j < caracter; j++) {
                //GENERAR CARACTER ALEATORIO
                int letra = (int) Math.floor(Math.random() * (122
                        - 97) + 97);
                palabra = palabra + (char) letra;
            }
            raf.writeChars(palabra+"\n");
            System.out.println(palabra);
            palabra ="";
        }
        bloqueo.release();
        bloqueo=null;
        raf.close();
    }

}
