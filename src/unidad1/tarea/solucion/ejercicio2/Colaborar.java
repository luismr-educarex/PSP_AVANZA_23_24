
package unidad1.tarea.solucion.ejercicio2;


public class Colaborar {

    public static void main(String[] args) {
        // Bucle para abrir los cinco procesos
        if(args[0]!=null){
            for(int i=0; i<=5;i++){
                Process proceso;
                try{
                    // Se abre proceso tomando como argumento el nombre del programa a ejecutar
                    // el argumento para el número de letras y palabras se toma del for
                    proceso = Runtime.getRuntime().exec("java -jar " + args[0] +" " + i + " texto.txt");
                }catch(Exception e){
                    System.out.println("Error "+e);
                }
            }
        }
        else{
            System.out.println("Erro en el número de parámetros, introduce solo el programa a ejecutar");
        }
    }
}
