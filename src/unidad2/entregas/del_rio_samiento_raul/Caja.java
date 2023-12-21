package unidad2.entregas.del_rio_samiento_raul;


/**
 *
 * @author Raul del rio sarmiento
 */
class Caja extends Thread {

    private int identificador;
    private FilaUnica filaUnica;

    public Caja(int identificador, FilaUnica filaUnica) {
        this.identificador = identificador;
        this.filaUnica = filaUnica;

    }

    public void run() {
        int cliente;
        int numClientes = 0;
        int proximoClienteEnEspera = filaUnica.obtenerProximoClienteEnEspera();
        System.out.println("La caja " + identificador + " preparada para atender al cliente " + proximoClienteEnEspera);
        while (filaUnica.hayClientesEnFila()) {
            cliente = filaUnica.atenderCliente();
            try {
                if (cliente != 0) {
                    System.out.println("La caja " + identificador + " atendiendo al cliente " + cliente);
                    int tiempoAtencion = (int) (Math.random() * 100 + 10);
                    sleep(tiempoAtencion);

                    numClientes++;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {

                System.out.println("La caja " + identificador + " está libre.");

                if (filaUnica.obtenerProximoClienteEnEspera() != 0) {
                    proximoClienteEnEspera=filaUnica.obtenerProximoClienteEnEspera();
                    System.out.println("La caja " + identificador + " preparada para atender al cliente " + proximoClienteEnEspera);
                }
            }
        }
        System.out.println("La caja " + identificador + " ha terminado su trabajo. Ha atendido " + numClientes + " clientes.");

    }
}
