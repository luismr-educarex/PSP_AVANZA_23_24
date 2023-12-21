package unidad2.entregas.rosado_nabais_marta;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * Clase que representa a un cliente que puede ser añadido a una fila única.
 *
 * @author marta
 */
public class Cliente {

    int idCliente;
    LinkedBlockingQueue<Cliente> filaUnica;

    /**
     * Constructor de la clase Cliente.
     *
     * @param idCliente Identificador único del cliente.
     * @param filaUnica Fila única a la que se añade el cliente.
     */
    public Cliente(int idCliente, LinkedBlockingQueue<Cliente> filaUnica) {
        this.idCliente = idCliente;
        this.filaUnica = filaUnica;
    }

    public int getIdCliente() {
        return idCliente;
    }

    /**
     * Método para añadir el cliente a la fila única. El cliente es agregado a
     * la fila y se muestra un mensaje indicando su llegada.
     */
    public void añadirCola() {
        try {
            filaUnica.put(this);
        } catch (InterruptedException ex) {
            ex.getMessage();
        }
        System.out.println("El cliente " + idCliente + " llega a la cola");
    }
}
