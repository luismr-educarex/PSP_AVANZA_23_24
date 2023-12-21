package unidad2.entregas.ventura_sierra_oscar;


import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author oscar
 */
public class Cliente {
    
   private int posicion_cliente;
    
    public Cliente(int pos) {
        this.posicion_cliente = pos;
        
    }
    
    public Cliente() {
        
        
    }
    
    public static int generarCliente() {
         return (int) ((Math.random() * 10)+1);
    }
    
    public int getPos(){
        return posicion_cliente;
    }
    
    public void setPos(int pos){
        this.posicion_cliente = pos;
        
        
    }
    @Override
    public String toString() {
        return "cliente" + posicion_cliente;
    }
}

