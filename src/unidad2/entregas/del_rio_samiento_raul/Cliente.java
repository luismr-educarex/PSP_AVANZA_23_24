package unidad2.entregas.del_rio_samiento_raul;

/**
 *
 * @author Raul del rio sarmiento
 */
class Cliente extends Thread {
    private int identificador;
    private FilaUnica filaUnica;

    public Cliente(int identificador, FilaUnica filaUnica) {
        this.identificador = identificador;
        this.filaUnica = filaUnica;
    }

    public void run() {
        filaUnica.agregarCliente(identificador);
    }
}
