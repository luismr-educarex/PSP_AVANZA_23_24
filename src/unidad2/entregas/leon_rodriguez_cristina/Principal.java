/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2.entregas.leon_rodriguez_cristina;



/**
 *
 * @author Cristina
 */
public class Principal {
   
    public static void main(String[] args) {
        
        int numClientes = 5;
        int numCajas = 2;

        FilaUnica filaUnica = new FilaUnica(numCajas);

        for (int i = 1; i <= numClientes; i++) {
            Thread cliente = new Cliente(filaUnica, i);
            cliente.start();
        }
    }
            
}
