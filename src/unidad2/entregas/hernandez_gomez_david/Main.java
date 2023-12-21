package unidad2.entregas.hernandez_gomez_david;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author darkd
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int cajaRandom= (int) (Math.random()*3)+1;
     int clienteRandom= (int) (Math.random()*15)+10;
     
     FilaUnica fila= new FilaUnica();
        System.out.println("Los clientes serán atendidos en "+cajaRandom +" cajas.");
     
     Cliente[] c= new Cliente[clienteRandom];
        for (int i = 0; i<clienteRandom; i++) {
         
             c[i]= new Cliente(i+1,fila);
             c[i].start();
             
        }
        
     Caja[] cj= new Caja[cajaRandom];
        for (int i = 1; i <cajaRandom; i++) {
             cj[i]= new Caja(i+1,fila);
             cj[i].start();
                
        }
        for (int i = 0; i<clienteRandom; i++) {
         try {
             
             c[i].join();
         } catch (InterruptedException ex) {
             Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
         }
        }
        for (int i = 1; i <cajaRandom; i++) {
             try {
             cj[i].join();
         } catch (InterruptedException ex) {
             Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
         }
        System.out.println("La cola se ha vaciado.");
    }
}
}

