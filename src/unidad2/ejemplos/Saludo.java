package unidad2.ejemplos;

public class Saludo extends Thread {
	 //clase  que extiende a Thread
	    public void run() {
	    // se redefine el m�todo run() con el c�digo asociado al hilo
	        System.out.println("Saludo desde un hilo extendiendo thread!");
	    }
	    public static void main(String args[]) {
	        Saludo hilo1=new Saludo();
	        //se crea un objeto Thread, el hilo hilo1
	        hilo1.start();
	        //invoca a start() y pone en marcha el hilo hilo1
	    }
	  } 