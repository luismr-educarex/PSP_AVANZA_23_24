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
public class Cliente extends Thread {
    private FilaUnica fila;//para guardar el objeto FilaUnica
    private int numeroCliente; //el numero de cliente que se va a crear
    
    private Semaphore semaforo = new Semaphore(1);;

    public Cliente(FilaUnica fila, int numeroCliente) {
        this.fila = fila;
        this.numeroCliente = numeroCliente;
    }
    
    public void run(){
        try {
             
            semaforo.acquire();
           
            fila.nuevoCliente(numeroCliente); //llamamos a la funcion para añadir un cliente a la fila
            System.out.println("El cliente "+numeroCliente+ " ha llegado a la fila");
            Thread.sleep(1000);
            semaforo.release();
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
