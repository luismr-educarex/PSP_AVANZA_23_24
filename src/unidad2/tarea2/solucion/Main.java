package unidad2.tarea2.solucion;

public class Main {
    public static void main(String[] args) {
        int numClientes = 10;
        int numCajas = 3;

        FilaUnica filaUnica = new FilaUnica(numCajas);

        for (int i = 1; i <= numClientes; i++) {
            Cliente cliente = new Cliente(i, filaUnica);
            cliente.start();
        }
    }
}
