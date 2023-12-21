/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad1.entregas.roman_marquez_gonzalo.tarea2_1;

/**
 *
 * @author Gonzalo Román
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                
        //creamos un instancia de PilaSin, el stack,el buffer, la lista, lo que van a compartir para meter y sacar caracteres       
        PilaSin stack = new PilaSin();
        
        //creamos el productor y le pasamos el stack, o la lista, por parametros
        Productor p1 = new Productor(stack);
        //creamos el hilo y añadimos p1 que es el productor
        Thread prodT1 = new Thread(p1);
       //arrancamos el hilo prodT1, que es el del productor
        prodT1.start();


        
        //Creamos el Consumidor y le pasamos el stack por parametros.
        Consumidor c1 = new Consumidor(stack);
        //creamos el hilo donde va el consumidor y añadimos el c1 que es el consumidor
        Thread consT1 = new Thread(c1);
        //arrancamos el hilo consT1
        consT1.start();
        

        
    }
    
}
