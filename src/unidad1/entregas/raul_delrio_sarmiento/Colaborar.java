
package unidad1.entregas.raul_delrio_sarmiento;

/**
 *
 * @author raul
 */
import java.io.IOException;

public class Colaborar {
    public static void main(String[] args) {
        int numInstancias = Integer.parseInt(args[0]);
        String archivo = args[1];
        for (int i = 1; i <= numInstancias; i++) {
            String[] lenguajeArgs = { Integer.toString(i), archivo};
            try {
                ProcessBuilder processBuilder = new ProcessBuilder("java", "-jar", "lenguaje.jar", lenguajeArgs[0], lenguajeArgs[1]);
                Process process = processBuilder.start();
                process.waitFor();
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Archivo creado correctamente");
    }
}

