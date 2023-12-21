package unidad2.ejemplos.hilos;

class AplicacionHilo {
	public static void main(String args[]) {
		
		new Hilo(); // create a new thread
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Hilo principal: " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Hilo principal interrumpido.");
		}
		System.out.println("Terminando hilo principal.");
	}
}
