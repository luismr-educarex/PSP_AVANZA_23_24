
package unidad2.tarea1.entregas.antonio_jesus_rosas_prieto;




public class Programa {

    
    public static void main(String[] args) {
        
        try {
            Buffer buffer = new Buffer (6);
            Productor productor = new Productor(buffer);
            Consumidor consumidor = new Consumidor(buffer);
            
            productor.start();
            consumidor.start();
            
            productor.join();
            consumidor.join();
        } catch (InterruptedException ex) {
            System.out.println(ex.toString());
        }
        
    }
    
}
