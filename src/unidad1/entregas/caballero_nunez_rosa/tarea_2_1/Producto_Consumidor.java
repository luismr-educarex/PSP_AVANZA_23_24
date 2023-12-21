/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad1.entregas.caballero_nunez_rosa.tarea_2_1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FA507
 */
public class Producto_Consumidor {

    public static void main(String[] args) {
        
     
        try {
            Buffer b = new Buffer(6);
            Productor p = new Productor(b);
            Consumidor c = new Consumidor(b);
            
            p.start();
            Thread.sleep(3000);
            c.start();
            
            p.join();
            c.join();
            System.out.println("El programa ha finalizado");
        } catch (InterruptedException ex) {
            Logger.getLogger(Producto_Consumidor.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        }
        
    }
