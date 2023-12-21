package unidad2.tarea2.solucion;

class Cliente extends Thread {
    private int id;
    private FilaUnica fila;

    public Cliente(int id, FilaUnica fila) {
        this.id = id;
        this.fila = fila;
    }

    @Override
    public void run() {
        try {
            fila.atenderCliente(id);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
