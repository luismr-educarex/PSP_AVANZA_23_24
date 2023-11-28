package unidad2.tarea1.entregas.antonio_jesus_rosas_prieto;


public class Buffer {

    private char[] caracter;
    private int siguiente;
    private boolean bufferLleno;
    private boolean bufferVacio;

     public Buffer(int memoria) {
        this.caracter = new char[memoria];
        this.siguiente = 0;
        this.bufferLleno = false;
        this.bufferVacio = true;
    }

    public synchronized char consumidor() {
        while (this.bufferVacio) {
            try {
                wait();
            } catch (InterruptedException ex) {
                System.out.println(ex.toString());
            }
        }
        this.siguiente--;
        this.bufferLleno = false;

        if (this.siguiente == 0) {
            this.bufferVacio = true;
        }
        notifyAll();
        return this.caracter[this.siguiente];
    }

    public synchronized void productor(char caracter) {
        while(this.bufferLleno){
            try {
                wait();
            } catch (InterruptedException ex) {
                System.out.println(ex.toString());
            }
            
            }
        this.caracter[this.siguiente]=caracter;
            this.siguiente++;
            this.bufferVacio=false;
            
            if(this.siguiente==this.caracter.length){
                this.bufferLleno=true;
            notifyAll();
        }
    }

}
