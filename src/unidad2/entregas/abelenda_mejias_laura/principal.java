/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2.entregas.abelenda_mejias_laura;

/**
 *
 * @author Laura Abelenda
 */
public class principal {
    
    public static void main(String[] args){
        System.out.println("5 Clientes para 2 Cajas - Comenzamos a trabajar");
        
        FilaUnica FilUnic=new FilaUnica();
        Cliente cliente1= new Cliente (FilUnic, 1);
        Cliente cliente2= new Cliente (FilUnic, 2);
        Cliente cliente3= new Cliente (FilUnic, 3);
        Cliente cliente4= new Cliente (FilUnic, 4);
        Cliente cliente5= new Cliente (FilUnic, 5);
        
        Caja caja1=new Caja (FilUnic, 1);
        Caja caja2=new Caja (FilUnic, 2);
        
        cliente1.start();
        cliente2.start();
        cliente3.start();
        cliente4.start();
        cliente5.start();
        
        caja1.start();
        caja2.start();       
    }    
}

