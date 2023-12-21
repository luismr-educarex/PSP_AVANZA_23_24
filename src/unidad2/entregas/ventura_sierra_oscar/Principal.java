package unidad2.entregas.ventura_sierra_oscar;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author oscar
 */
import java.util.ArrayList;
import java.util.concurrent.Semaphore;

public class Principal {
    public static void main(String[] args) {
        int numCajas = Caja.generarCajas();
        Semaphore filaUnica = new Semaphore(1, true);
        int numClientes = Cliente.generarCliente();
        ArrayList<Cliente> filaClientes = new ArrayList<>();
        System.out.println(numClientes + " Clientes para " + numCajas + " cajas ");

        for (int i = 1; i <= numClientes; i++) {
            Cliente cliente = new Cliente(i);
            filaClientes.add(cliente);
            System.out.println("El cliente " + i + " llega a la cola ");
        }

        ArrayList<Caja> cajas = new ArrayList<>();
        for (int i = 1; i <= numCajas; i++) {
            Caja caja = new Caja("Caja " + i, filaUnica, filaClientes);
            cajas.add(caja);
        }

        for (Caja caja : cajas) {
            caja.start();
        }

        for (Caja caja : cajas) {
            try {
                caja.join();
            } catch (InterruptedException e) {
            }
        }

        System.out.println("Todos los clientes han sido atendidos.");
    }
}
