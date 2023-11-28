/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad1.entregas.caballero_nunez_rosa;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rosa Caballero Núñez
 */
public class lenguaje {

    
    public static void main(String[] args) {
       
        
        String letras = "abcdefghijklmnopqrstuvwxyz";
        String fichero;
        FileLock block = null;
        
        if(args.length ==2){ 
            
        try {
            
            int numLineas = Integer.parseInt(args[0]);
            String osName = System.getProperty("os.name");
            
            if(osName.toUpperCase().contains("WIN")){
                fichero = args[1].replace("\\","\\\\");
            }else{
            fichero = args[1];
            }
        File archivo = new File(fichero);
        
        if(!archivo.exists()){
                
                    archivo.createNewFile();
                
        }
        RandomAccessFile raf = new RandomAccessFile(archivo, "rwd");
        
        block = raf.getChannel().lock();
        
        raf.seek(archivo.length());
        
        for(int i = 0; i < numLineas; i++){
         String linea = "";
         int numCaracteres = generarNumeroAleatorio(1,10);
         for(int j = 0; j < numCaracteres; j++){
             linea += letras.charAt(generarNumeroAleatorio(0, letras.length() - 1));
             
         }
         
         raf.writeChars(linea + "\n");
        }
        
        
        block.release();
        block = null;
        raf.close();
        
       } catch (IOException ex) {
                    Logger.getLogger(lenguaje.class.getName()).log(Level.SEVERE, null, ex);
                }
    } else {
        System.out.println("Se deben establecer dos parámetros");
        }
    
}
    
     public static int generarNumeroAleatorio(int minimo, int maximo){
   int num=(int)(Math.random()*(maximo-minimo+1)+(minimo));
   return num;
   } 
    
}
