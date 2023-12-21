package unidad1.entregas.rosado_nabais_marta.tareea_2_1;

import java.util.LinkedList;

/**
 * Clase que define un búfer compartido por los productores y consumidores.
 *
 * @author marta
 */
public class Bufer {

    LinkedList<Character> bufer = new LinkedList<>();

    /**
     * Constructor por defecto
     */
    public Bufer() {

    }

    /**
     * Método sincronizado para añdir un carácter al búfer.
     *
     * @param c El carácter a añadir.
     */
    public synchronized void producir(char c) {
        while (bufer.size() == 6) {
            try {
                wait();
            } catch (InterruptedException ex) {
                ex.getMessage();
            }
        }
        bufer.add(c);
        System.out.println("Depositado el carácter " + c + " en el búfer");
        notify();
    }

    /**
     * Método sincronizado para consumir un carácter del búfer.
     */
    public synchronized void consumir() {

        while (bufer.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException ex) {
                ex.getMessage();
            }
        }
        char caracter = bufer.remove();
        System.out.println("Recogido el carácter " + caracter + " en el búfer");
        notify();
    }
}
