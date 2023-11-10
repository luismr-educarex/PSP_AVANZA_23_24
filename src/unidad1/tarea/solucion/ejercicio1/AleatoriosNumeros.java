
package unidad1.tarea.solucion.ejercicio1;


public class AleatoriosNumeros {


    public static void main(String[] args) {
        // TODO code application logic here
        for(int i=1; i<40; ++i ){
            int numero = (int)(Math.random()*100+1);
            System.out.println(numero);
        }
    }
    
}
