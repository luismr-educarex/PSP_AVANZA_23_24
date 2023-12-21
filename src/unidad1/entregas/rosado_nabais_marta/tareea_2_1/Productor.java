package unidad1.entregas.rosado_nabais_marta.tareea_2_1;

import java.util.Random;

/**
 * Clase que define un hilo que produce carácteres.
 *
 * @author marta
 */
public class Productor extends Thread {

    Bufer bufer;

    /**
     * Constructor del Productor.
     *
     * @param bufer El búfer compartido.
     */
    public Productor(Bufer bufer) {
        this.bufer = bufer;
    }
    
    /**
     * Método que inicia la ejecución del hilo.
     * Llama al método producir() del búfer.
     */
    public void run() {

        Random random = new Random();
        char caracter = (char) (random.nextInt(90-65) + 65);
        bufer.producir(caracter);

    }
}
