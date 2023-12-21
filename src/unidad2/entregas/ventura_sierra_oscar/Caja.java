package unidad2.entregas.ventura_sierra_oscar;


import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.concurrent.Semaphore;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author oscar
 */
public class Caja extends Thread {
    private ArrayList<Cliente> fila;
    private Semaphore filaUnica;

    public Caja(String nombre, Semaphore filaUnica, ArrayList<Cliente> fila) {
        super(nombre);
        this.fila = fila;
        this.filaUnica = filaUnica;
    }

    @Override
    public void run() {
        int contador = 0;
        while (true) {
            Cliente cliente = null;

           
            try {
                filaUnica.acquire();  
                if (!fila.isEmpty()) {
                    cliente = fila.get(0);
                    fila.remove(0);  
                }
            } catch (InterruptedException ex) {
            } finally {
                filaUnica.release();  
            }

            if (cliente != null) {
                System.out.println("La " + getName() + " preparada para atender a " + cliente.toString());
                System.out.println("La " + getName() + " atendiendo a " + cliente.toString());

                contador++;
                try {
                    sleep((long) (Math.random() * 4000));
                } catch (InterruptedException ex) {
                }
            } else {
                break;  
            }
        }

        System.out.println("La " + getName() + " ha terminado su turno y ha atendido a " + contador + " clientes");
    }

    public static int generarCajas() {
        return 2;  
    }
}
