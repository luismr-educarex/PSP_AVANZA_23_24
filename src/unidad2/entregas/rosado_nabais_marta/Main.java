package unidad2.entregas.rosado_nabais_marta;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;

/**
 * Clase principal que inicia la simulación de cajas de atención con clientes.
 *
 * @author marta
 */
public class Main {

    /**
     * Método principal que inicia la simulación.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        System.out.print("Numero de clientes: ");
        int numCajas = Integer.parseInt(entrada.nextLine());
        System.out.print("Numero de cajas: ");
        int numClientes = Integer.parseInt(entrada.nextLine());
        
        Semaphore fila = new Semaphore(numCajas);
        LinkedBlockingQueue<Cliente> filaUnica = new LinkedBlockingQueue<>();
        Cliente cliente;
        Caja hiloCaja;
        
        // Contador para verificar la finalización de las cajas
        CountDownLatch cajasTerminadas = new CountDownLatch(numCajas);

        System.out.println(numClientes + " Clientes para " + numCajas + " Cajas - Comenzamos a trabjar");
        
        //Crea n números de cliente y llama al método para añadirlos a la cola.
        for (int i = 1; i <= numClientes; i++) {
            cliente = new Cliente(i, filaUnica);
            cliente.añadirCola();
        } 
        //Crea y arranca los hilos caja.
        for (int i = 1; i <= numCajas; i++) {
            hiloCaja = new Caja(i, fila, filaUnica, cajasTerminadas);
            hiloCaja.start();
        }

        try {
            cajasTerminadas.await(); // Espera a que todos los hilos de caja terminen
        } catch (InterruptedException ex) {
            ex.getMessage();
        }
        System.out.println("Trabajo terminado - SE CIERRAN LAS CAJAS");

    }

}
