/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2.entregas.caballero_nunez_rosa;

import static java.lang.Thread.sleep;

/**
 *
 * @author FA507
 */
public class Caja extends Thread {
    
  private int codigo;
  private FilaUnica filaunica;
    
 public Caja(int codigo, FilaUnica filaunica){
 this.codigo = codigo;
 this.filaunica=filaunica;
 }   
    
  public void run(){
  int retardo;
  int numeroCliente;
  while (filaunica.isClientesPendientes()){ //bucle que dirá si la lista esta llena o vacia, mientras no este llena se ejecutará este código
      try{
      retardo = (int)(Math.random()*90+10);
      numeroCliente=filaunica.terminarCliente(retardo);
      System.out.println( "El cliente " + numeroCliente + " ha llegado a la cola" );
      sleep(retardo);
      System.out.println("La caja " + codigo + " ha despachado al cliente " + numeroCliente);
      }catch (InterruptedException e){
          e.printStackTrace();
      }
      }
  System.out.println("La caja " + codigo + " ha terminado su trabajo");
  }
}