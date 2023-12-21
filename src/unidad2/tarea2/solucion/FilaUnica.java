package unidad2.tarea2.solucion;

import java.util.concurrent.Semaphore;

class FilaUnica {
    private Semaphore semaforo;

    public FilaUnica(int numCajas) {
        semaforo = new Semaphore(numCajas, true);
    }

    public void atenderCliente(int clienteId) throws InterruptedException {
        semaforo.acquire();
        try {
            System.out.println("Cliente " + clienteId + " en la fila única");
            // Obtener una caja disponible
            Caja caja = obtenerCajaDisponible();
            // Atender al cliente en la caja
            caja.atenderCliente(clienteId);
        } finally {
            semaforo.release();
        }
    }
    
    private Caja obtenerCajaDisponible() {
        // En este ejemplo, simplemente se devuelve una caja (podría ser más complejo)
        return new Caja(1); // Se puede mejorar para asignar la caja disponible
    }
}