/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2.entregas.caballero_nunez_rosa;

/**
 *
 * @author FA507
 */
public class Cliente extends Thread{
    
  private int codigo;
  private FilaUnica filaunica;
    
    public Cliente(int codigo, FilaUnica filaunica){
    this.codigo = codigo;
    this.filaunica = filaunica;
    }

    public void run(){
        
        filaunica.nuevoCliente(codigo);
    }
    
    
    
}
