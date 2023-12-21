/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad1.entregas.roman_marquez_gonzalo.tarea2_1;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gonzalo Román
 */
public class PilaSin {
    
//tiene dos metodos el metodo pop y el metodo push
//pop saca los caracteres
//push inserta los caracteres   
    
//Esto el el buffer donde van a guardar los caracteres. Es decir es un aray o buffer de caracteres
public static List<Character> buffer = new ArrayList<Character>();


//El metodo pop quita un caracter del buffer si es distinto de cero
    public synchronized  char pop() { // retirar
        
        char c = 0; //incializamos c
        // System.out.println("el bufer es del tamaño: "+buffer.size());
        while (buffer.size() != 0) { //mientras haya algo en el buffer
            c = buffer.remove(buffer.size() - 1);//elimina el ultimo y lo guaramos en c
            System.out.println("Recogiendo el valor: " + c + " Del buffer"); //imprimimos el valor que hemos quitado

           /* if (buffer.size() == 0) {
                 //   this.wait(); //pongo en espera hata que push avise con notify                           
            }*/
        }
            return c; //devolvemos c que hemos eliminado
    }
    
//el metodo añade un caracter al buffer si es menor de 6
    public synchronized  void push(char c) { // añadir
        if (buffer.size() < 6) { //comprobamos si es menor de 6
          //  this.notify(); //lanza notify para desbloquear el wait de pop()
            buffer.add(c); //como es menor que 6 añade un caracter que hemos recibido por parametros
            System.out.println("Depositado valor " + c + " en el buffer");
        }
    } //hasta que no se salta del bloque synchronized no se desbloquea el recurso.
}