/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2.entregas.abelenda_mejias_laura;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Laura Abelenda
 */
public class Cliente extends Thread{
    
    int id;
    FilaUnica FilUnic;
    Cliente (FilaUnica FilUnic, int id){
        this.FilUnic=FilUnic;
        this.id=id;
    }
    
    public void run(){
        System.out.println("El cliente" + id + " llega a la cola");
        try {
            FilUnic.serAtendido(id);
        } catch (InterruptedException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
