/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2.entregas.leon_rodriguez_cristina;

import java.util.concurrent.*;

class FilaUnica {
    
    // Declaramos un objeto Semaphore llamado filaUnica;
    private Semaphore filaUnica;

    // Toma un parámetro cajasDisponibles que representa la cantidad inicial de cajas disponibles. Inicializa el semáforo con la cantidad de cajas disponibles
    public FilaUnica(int cajasDisponibles) {
       
        filaUnica = new Semaphore(cajasDisponibles);
    }

    // Método que simula la atención a un cliente
    public void atenderCliente(int clienteID) {
        try {
            
            // Adquiere un permiso del semáforo. Si no hay permisos disponibles, el hilo espera.
            filaUnica.acquire();
            System.out.println("Cliente " + clienteID + " está siendo atendido en la caja.");
            
            // Simular tiempo de atención aleatorio
            Thread.sleep((int) (Math.random() * 1000));
            System.out.println("Cliente " + clienteID + " ha sido atendido.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            
            // Se asegura de que el recurso (caja) se libere, independientemente de si ocurrió una excepción o no.
            filaUnica.release();
        }
    }
}

class Cliente extends Thread {
    
    //  Referencia a un objeto FilaUnica para que el cliente pueda acceder a la fila única.
    private FilaUnica filaUnica;
    private int clienteID;

    // El constructor toma una referencia a FilaUnica y un clienteID como parámetros y los asigna a las variables miembro correspondientes.
    public Cliente(FilaUnica filaUnica, int clienteID) {
        this.filaUnica = filaUnica;
        this.clienteID = clienteID;
    }

    // Cuando se inicia el hilo del cliente, ejecuta el método atenderCliente() de la fila única.
    @Override
    public void run() {
        filaUnica.atenderCliente(clienteID);
    }
}

