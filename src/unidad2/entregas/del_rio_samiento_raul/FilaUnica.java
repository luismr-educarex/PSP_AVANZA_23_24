package unidad2.entregas.del_rio_samiento_raul;


import java.util.PriorityQueue;
import java.util.concurrent.Semaphore;

/**
 *
 * @author Raul del rio sarmiento
 */
class FilaUnica {

    private Semaphore semaforo;
    private PriorityQueue<Integer> filaClientes;

    public FilaUnica(int numCajas) {
        semaforo = new Semaphore(numCajas);
        filaClientes = new PriorityQueue<>();
    }

    public void agregarCliente(int numeroCliente) {
        try {
            //adquiere permiso de la clase Semaphore
            semaforo.acquire();
            
            //sección sincronizada para agregar clientes
            synchronized (filaClientes) {
                filaClientes.add(numeroCliente);
            }
            
            //se libera el permiso de Semaphore
            semaforo.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int atenderCliente() {
        int clienteAtendido = 0;
        try {
            if (hayClientesEnFila()) {
                semaforo.acquire();
                synchronized (filaClientes) {
                    if (hayClientesEnFila()) {
                        clienteAtendido = filaClientes.poll();
                    }
                }
                semaforo.release();

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return clienteAtendido;
    }
    
    //Método para obtener el cliente en espera para mostrar que caja esta disponible para el
    public int obtenerProximoClienteEnEspera() {
        int proximoCliente = 0;
        synchronized (filaClientes) {
            if (!filaClientes.isEmpty()) {
                proximoCliente = filaClientes.peek();
            }
        }
        return proximoCliente;
    }

    public boolean hayClientesEnFila() {
        synchronized (filaClientes) {
            return !filaClientes.isEmpty();
        }
    }
}
