
package unidad2.tarea1.entregas.antonio_jesus_rosas_prieto;


public class Consumidor extends Thread{
    
    private Buffer buffer;
    private int consumidas;
    
   
   public Consumidor(Buffer buffer) {
        this.consumidas=0;
        this.buffer=buffer;
    }
    
    public void run(){
        while(consumidas < 15){
            try {
                char caracter = buffer.consumidor();
                consumidas++;
                System.out.println("Recogido el carácter " +caracter +" del buffer");
                sleep((int)(Math.random()*1000));
            } catch (InterruptedException ex) {
                System.out.println(ex.toString());
            }
        }
    }
    
}
