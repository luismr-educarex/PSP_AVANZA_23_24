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
public class Caja extends Thread{
    
    int id;
    FilaUnica FilUnic;
    Caja (FilaUnica FilUnic, int id){
        this.FilUnic=FilUnic;
        this.id=id;
    }
    
    public void run(){
        System.out.println("La caja" + id + " esta libre");
        try {
            while(true){
                FilUnic.Atender(id);
            }
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Caja.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
    

