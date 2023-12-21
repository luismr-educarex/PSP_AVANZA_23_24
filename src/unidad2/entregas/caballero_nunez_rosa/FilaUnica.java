/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2.entregas.caballero_nunez_rosa;


import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.Semaphore;

/**
 *
 * @author FA507
 */
public class FilaUnica {
    
  private Semaphore semaforo; 
  private PriorityQueue <Integer> listaClientes;
   
    public FilaUnica(){

        semaforo = new Semaphore(1);
        listaClientes = new PriorityQueue<Integer>();
}
   
    public void nuevoCliente(int numeroCliente){
    
   try{
   semaforo.acquire();
   listaClientes.add(numeroCliente);
   semaforo.release();
   }catch(InterruptedException e){
       e.printStackTrace();
   }

    }
public int terminarCliente(Integer tiempoParcial){
int cliente=0;
try{
if(isClientesPendientes()){
    semaforo.acquire();
    cliente = listaClientes.poll();
    semaforo.release();
}
}catch(InterruptedException e){
       e.printStackTrace();
}
return cliente;
}

public boolean isClientesPendientes(){
    return listaClientes.size()>0;
}
}
    
    
    

