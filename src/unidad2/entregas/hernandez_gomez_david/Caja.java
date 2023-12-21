package unidad2.entregas.hernandez_gomez_david;



/**
 *
 * @author darkd
 */
public class Caja extends Thread{
    private FilaUnica fila;
    private int num;
    
    public Caja(int num,FilaUnica fila){
        this.fila=fila;
        this.num=num;
    }
    
    @Override
    public void run(){
        int numCliente;
        while(fila.isClientesPendientes()){
            numCliente= fila.clienteAtendido();
            System.out.println("La caja "+num+" ha terminado de atender al cliente "+numCliente+".");
            
        }
        System.out.println("Se cierra la caja "+num);
    }
    
    
}
