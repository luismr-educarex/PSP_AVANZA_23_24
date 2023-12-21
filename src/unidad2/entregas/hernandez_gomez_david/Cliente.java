package unidad2.entregas.hernandez_gomez_david;

/**
 *
 * @author darkd
 */
public class Cliente extends Thread{
    private FilaUnica fila;
    private int num;
    
    public Cliente(int num,FilaUnica fila){
        this.fila=fila;
        this.num=num;
    }
    
    @Override
    public void run(){
        fila.nuevoCliente(num);
    }
    
    
}
