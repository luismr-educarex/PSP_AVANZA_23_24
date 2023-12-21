package unidad2.entregas.rosado_nabais_marta;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase que representa una caja que atiende a los clientes en una fila única.
 * Extiende la clase Thread para poder ser ejecutada como un hilo.
 *
 * @author marta
 */
public class Caja extends Thread {

    int idCaja;
    LinkedBlockingQueue<Cliente> filaUnica;
    Semaphore semaforo;
    CountDownLatch cajasTerminadas;
    int contador = 0;

    /**
     * Constructor de la clase Caja.
     *
     * @param idCaja Identificador de la caja.
     * @param s Semáforo para control de acceso a la caja.
     * @param filaUnica Fila única de clientes.
     * @param cajasTerminadas Contador de cajas que han terminado su trabajo.
     */
    public Caja(int idCaja, Semaphore s, LinkedBlockingQueue<Cliente> filaUnica, CountDownLatch cajasTerminadas) {
        this.idCaja = idCaja;
        this.semaforo = s;
        this.filaUnica = filaUnica;
        this.cajasTerminadas = cajasTerminadas;

    }

    public int getIdCaja() {
        return idCaja;
    }

    /**
     * Método que representa la ejecución del hilo de la caja. Atiende a los
     * clientes en la fila única hasta que esta esté vacía.
     */
    public void run() {

        while (!filaUnica.isEmpty()) {
            try {
                int idCliente = filaUnica.take().getIdCliente();
                System.out.println("La caja " + this.getIdCaja() + " preparada para atender al cliente " + idCliente);

                semaforo.acquire();
                System.out.println("La caja " + this.getIdCaja() + " atendiendo al cliente " + idCliente);
                Thread.sleep((int) (Math.random() * 1000));
                contador++;

                semaforo.release();
                System.out.println("La caja " + this.getIdCaja() + " esta libre");

            } catch (InterruptedException ex) {
                Logger.getLogger(Caja.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        System.out.println("La caja " + this.getIdCaja() + " ha terminado su trabajo. Ha atendido " + contador + " clientes");
        cajasTerminadas.countDown();
    }

}
