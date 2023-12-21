package unidad1.entregas.rosado_nabais_marta.tareea_2_1;
/**
 *
 * @author marta
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bufer bufer = new Bufer();

        //Iniciar 15 hilos productores
        for (int i = 0; i < 15; i++) {
            Productor hiloProductor = new Productor(bufer);
            hiloProductor.start();
            //Agragar retraso aleatorio
            try {
                hiloProductor.sleep((int) (Math.random() * 100));
            } catch (InterruptedException ex) {
                ex.getMessage();
            }
        }

        //Iniciar 15 hilos consumidores
        for (int i = 0; i < 15; i++) {
            Consumidor hiloConsumidor = new Consumidor(bufer);
            hiloConsumidor.start();
            //Agregar retraso aleatorio
            try {
                hiloConsumidor.sleep((int) (Math.random() * 1000));
            } catch (InterruptedException ex) {
                ex.getMessage();
            }
        }
    }

}
