/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2.entregas.roman_marquez_gonzalo;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gonzaloromanmarquez
 */
public class Caja extends Thread {
    private int numCaja; //el numero de caja 
    private FilaUnica fila; //el objeto FilaUnica para que lo reconozca
    private Semaphore semaforo;

    public Caja(FilaUnica fila, int numCaja) {
        this.numCaja = numCaja;
        this.fila = fila;
        this.semaforo = new Semaphore(1);
    }
    
    
    public void run() {
        int numCliente = 0;//el numero de cliente que nos va a retornar la funcion atendercliente que saca con el poll en filaUnica
        // int tiempoAleatorio = (int) (Math.random());
        while (fila.isClientesPendientes()) {
            try {
                semaforo.acquire();

                numCliente = fila.atenderCliente(numCaja);//Guardamos el numero del cliente atendido

                System.out.println("la caja: " + numCaja + " ha atendido al cliente: " + numCliente); //imprimimos el mensaje 

                semaforo.release();
                System.out.println("la caja: " + numCaja + " ESTA VACIA: "); //imprimimos el mensaje

            } catch (InterruptedException ex) {
                Logger.getLogger(Caja.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }
    
    
}
