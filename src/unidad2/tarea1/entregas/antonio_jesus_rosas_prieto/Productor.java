package unidad2.tarea1.entregas.antonio_jesus_rosas_prieto;


public class Productor extends Thread {

   private Buffer buffer;
   private String caracteres ="abcdefghijklmnñopqrstuvwxyz";
   private int producidas;
   
   public Productor (Buffer buffer){
       this.producidas=0;
       this.buffer=buffer;
   }

 
   
   public void run(){
       while(producidas<15){
           try {
               char caracter = caracteres.charAt((int)(Math.random() * caracteres.length()));
               buffer.productor(caracter);
               producidas++;
               System.out.println("Depositado el carácter " +caracter +" en el buffer");
               sleep((int) (100 * Math.random()));
           } catch (InterruptedException ex) {
               System.out.println(ex.toString());
           }
       }
   }

}
