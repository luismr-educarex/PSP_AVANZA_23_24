package unidad2.entregas.bracamonte_gonzalez_gonzalo;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Gonzalo Bracamonte
 */
public class PSP02_Tarea022 {
    static final int NUM_CLIENTES = 5;
    static final int NUM_CAJAS = 2;

    //Creamos el semáforo 
    static Semaphore filaUnica = new Semaphore(1);

    //Creamos un array de semáforos para representar cada caja disponible
    static Semaphore[] cajas = new Semaphore[NUM_CAJAS];

    static class Cliente extends Thread {
        int numero;

        public Cliente(int numero) {
            this.numero = numero;
        }

        public void run() {
            try {
                //Cuando un cliente llega a la fila única
                filaUnica.acquire();
                System.out.println("El cliente " + numero + " llega a la cola");
                filaUnica.release();

                //Cuando el cliente accede a cada caja disponible
                for (int i = 0; i < NUM_CAJAS; i++) {
                    cajas[i].acquire();
                    System.out.println("La caja " + (i + 1) + " preparada para atender al cliente " + numero);
                    System.out.println("La caja " + (i + 1) + " atendiendo al cliente " + numero);
                    cajas[i].release();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(NUM_CLIENTES + " Clientes para " + NUM_CAJAS + " Cajas - Comenzamos a trabajar");

        //Inicializamos semáforos para cada caja
        for (int i = 0; i < NUM_CAJAS; i++) {
            cajas[i] = new Semaphore(1);
        }

        //Creamos e iniciamos clientes
        for (int i = 1; i <= NUM_CLIENTES; i++) {
            new Cliente(i).start();
        }
    }
}
