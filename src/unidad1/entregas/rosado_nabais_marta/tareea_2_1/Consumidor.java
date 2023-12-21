package unidad1.entregas.rosado_nabais_marta.tareea_2_1;

/**
 * Clase que define un hilo que consume carácteres de un bufér compartido.
 *
 * @author Marta
 */
public class Consumidor extends Thread {

    Bufer bufer;

    /**
     * Constructor del Consumidor.
     * 
     * @param bufer El búfer compartido del cual se consumirán los caracteres.
     */
    public Consumidor(Bufer bufer) {
        this.bufer = bufer;
    }
    
    /**
     * Método que inicia la ejecución del hilo.
     * Llama al método consumir() del búfer.
     */
    public void run() {
        bufer.consumir();
    }
}
