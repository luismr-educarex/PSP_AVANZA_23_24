/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2.entregas.caballero_nunez_rosa;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FA507
 */
public class Main {

   
    public static void main(String[] args) {
    int cajaRandom = (int) (Math.random()*4)+1;
    int cliRandom = (int) (Math.random()*30)+20;
    FilaUnica filaunica = new FilaUnica();
    System.out.println( cliRandom + " clientes para " + cajaRandom + " cajas - Comenzamos a trabajar" );
    
    //creo los clientes
    Cliente[] c = new Cliente[cliRandom];
    for (int i = 0; i < cliRandom; i++){
    c[i] = new Cliente(i + 1,filaunica);
    c[i].start();
    }
     
    //creo las cajas
    Caja[] b = new Caja[cajaRandom];
    for (int i = 0; i < cajaRandom; i++){
    b[i] = new Caja(i + 1,filaunica);
    b[i].start();
    }
    
    //esperando a que terminen las cajas
    for (int i = 0; i < cajaRandom; i++){
        try {
            b[i].join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
        //esperando a que terminen todos los clientes
    for (int i = 0; i < cliRandom; i++){
        try {
            c[i].join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    //cerramos el proceso de fila unica
    
    System.out.println("Trabajo terminado SE CIERRAN LAS CAJAS");
    
    }
    
}
