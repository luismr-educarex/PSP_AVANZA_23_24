package unidad2.entregas.hernandez_gomez_david;

import java.util.PriorityQueue;
import java.util.concurrent.Semaphore;

/**
 *
 * @author darkd
 */
public class FilaUnica {
    
    private Semaphore semaforo;
    private PriorityQueue <Integer> listaClientes;
    
    public FilaUnica(){
        semaforo= new Semaphore(1);
        listaClientes= new PriorityQueue<Integer>();
        
    }
    public void nuevoCliente(Integer nClientes){
        try {
            semaforo.acquire();
            listaClientes.add(nClientes);
            semaforo.release();
        } catch (InterruptedException ex) {
            ex.getMessage();
        }
        
    }
    
    public int clienteAtendido(){
        
        int cliente =0;
        
        if(isClientesPendientes()){
            try {
                semaforo.acquire();
                cliente = listaClientes.poll();
                semaforo.release();
            } catch (InterruptedException ex) {
               ex.getMessage();
            }
                      
        }
        return cliente;
    }
    
    public boolean isClientesPendientes(){
        return listaClientes.size()>0;
    }
}
