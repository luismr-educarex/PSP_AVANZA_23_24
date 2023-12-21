package unidad2.tarea2.solucion;

import java.util.concurrent.Semaphore;



class Caja {
    private int id;

    public Caja(int id) {
        this.id = id;
    }

    public void atenderCliente(int clienteId) {
        System.out.println("Caja " + id + " atendiendo al Cliente " + clienteId);
        // Simular tiempo de atención
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Caja " + id + " ha terminado de atender al Cliente " + clienteId);
    }
}



   


