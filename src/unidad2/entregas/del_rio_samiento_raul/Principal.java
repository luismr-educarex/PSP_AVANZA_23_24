package unidad2.entregas.del_rio_samiento_raul;

/**
 *
 * @author Raul del rio sarmiento
 */
public class Principal {

    public static void main(String[] args) {
        int numCajas = 2; // Número de cajas disponibles
        int numClientes = 5; // Número de clientes

        FilaUnica filaUnica = new FilaUnica(numCajas);
        System.out.println(numClientes + " Clientes para " + numCajas + " cajas - Comenzamos a trabajar");

        // Creación de clientes
        Cliente[] clientes = new Cliente[numClientes];
        for (int i = 0; i < numClientes; i++) {
            clientes[i] = new Cliente(i + 1, filaUnica);
            clientes[i].start();
            System.out.println("El cliente "+(i+1)+" llega a la cola");
        }

        // Creación de cajas
        Caja[] cajas = new Caja[numCajas];
        for (int i = 0; i < numCajas; i++) {
            cajas[i] = new Caja(i + 1, filaUnica);
            cajas[i].start();
        }

        // Espera a que todas las cajas terminen
        for (int i = 0; i < numCajas; i++) {
            try {
                cajas[i].join();
                
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Espera a que todos los clientes terminen
        for (int i = 0; i < numClientes; i++) {
            try {
                clientes[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Trabajo terminado SE CIERRAN LAS CAJAS");
    }
}
