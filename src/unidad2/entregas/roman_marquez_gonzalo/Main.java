/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2.entregas.roman_marquez_gonzalo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gonzaloromanmarquez
 */
public class Main {
     public static void main(String[] args) {
         
         int numTotalClientes = 7;
         int numTotalCajas = 3;
         
         FilaUnica f = new FilaUnica();
         
         
         
         //Creamos los clientes con un for, y el nombre de la instancia varía con [i], ademas la i va ser el numero client
         //que vamos a pasar como parametro
         Cliente[] nCliente = new Cliente[numTotalClientes];
         for (int i = 0; i < numTotalClientes; i++) {
             nCliente[i]= new Cliente(f,i+1);
             nCliente[i].start(); //arrancamos el hilo del cliente
             try {
                 Thread.sleep(1000);
             } catch (InterruptedException ex) {
                 Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
             }
            
         }
         
         //Creamos las cajas
         Caja[] nCaja = new Caja[numTotalCajas];
         for (int i = 0; i < numTotalCajas; i++) {
             nCaja[i]= new Caja(f,i+1);
             nCaja[i].start(); //arrancamos el hilo de la caja
             
         }
         
         
         
         
         
     
     
     }
}
