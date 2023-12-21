package unidad2.ejemplos.hilos;

class Hilo implements Runnable {
	Thread t;

	Hilo() {
// Create a new, second thread
		t = new Thread(this, "Aplicacion Hilo");
		System.out.println("Hilo hijo: " + t);
		t.start(); // Start the thread
	}

// This is the entry point for the second thread.
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Hilo hijo: " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("Hilo hijo interrumpido.");
		}
		System.out.println("Saliendo del hilo hijo.");
	}
}