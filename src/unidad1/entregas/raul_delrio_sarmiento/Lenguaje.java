package unidad1.entregas.raul_delrio_sarmiento;

/**
 *
 * @author raul
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Lenguaje {
    public static void main(String[] args) {
        int palabras = Integer.parseInt(args[0]);
        String archivo = args[1];

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(archivo,true));

            for (int i = 0; i < palabras; i++) {
                String palabra = generarPalabraAleatoria(palabras);
                writer.write(palabra);
                writer.newLine();
            }

            writer.close();
            System.out.println("Archivo creado correctamente");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    private static String generarPalabraAleatoria(int longitud) {
        String caracteresPermitidos = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder palabraAleatoria = new StringBuilder();

        Random rand = new Random();
        for (int i = 0; i < longitud; i++) {
            int index = rand.nextInt(caracteresPermitidos.length());
            palabraAleatoria.append(caracteresPermitidos.charAt(index));
        }

        return palabraAleatoria.toString();
    }
}
