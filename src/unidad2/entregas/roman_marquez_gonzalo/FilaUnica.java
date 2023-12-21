/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2.entregas.roman_marquez_gonzalo;

import java.util.PriorityQueue;
import java.util.concurrent.Semaphore;


/**
 *
 * @author gonzaloromanmarquez
 */
public class FilaUnica {
    private Semaphore semaforo;
    
    private PriorityQueue <Integer> listaClientes;
    
    //Constructor creamos un semaforo y la lista Queue

    public FilaUnica() {
        this.semaforo = new Semaphore(1);
        
        this.listaClientes = new PriorityQueue <Integer>();
    }
    
    //un nuevo cliente se incorpora a la fila, selecciona el semaforo, se añade el numero de cliente a la lista y deja libre el semaforo
    
    public void nuevoCliente(Integer numeroCliente) throws InterruptedException {
      semaforo.acquire(); //adquirimos el semaforo
      listaClientes.add(numeroCliente); //añadimos cliente a la fila
      semaforo.release(); //soltamos semaforo
    
    }
    
    //comprobamos si hay clientes en fila comprobando que el tamaño sea mayor a 0 de la lista Queue
    public synchronized boolean isClientesPendientes(){
      return listaClientes.size()>0; //deuelve true si hay clientes en la fila
    
    }
    
    public synchronized int atenderCliente(int numCaja) { //recibe el numero de caja que va a atender al cliente
     int cliente = 0; //variable para guardar el cliente que va a atender, el que va sacar con poll de la lista
     int tiempoAleatorio = (int) (Math.random() * 2000); //tiempo que tarda en atender
     if (isClientesPendientes()){
         try {
             semaforo.acquire(); //si hay clientes pendientes adquirimos el semaforo
             cliente = listaClientes.poll();//guardamos el cliente sacado del poll, o cliente atendido
              System.out.println("la caja: "+numCaja+" va a atender al cliente: "+cliente); //imprimimos el mensaje
              Thread.sleep(tiempoAleatorio); //hacemos sleep con tiempo aleatorio
         } catch (InterruptedException ex) {
             System.out.println("finalizado");
         } finally{
          semaforo.release();
         }
         
        
         
     }
     return cliente; //devolvemos el cliente atendido
    }
    
    
    
    
    
}
