/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2.entregas.abelenda_mejias_laura;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;

/**
 *
 * @author Laura Abelenda
 */
public class FilaUnica {
    
    Semaphore mutex= new Semaphore(1);
    Semaphore esperando= new Semaphore(0);
    Semaphore caja1= new Semaphore(1);
    Semaphore caja2= new Semaphore(1);
    int contador1=0;
    int contador2=0;
    
    
    ArrayList<Integer> colaArray= new ArrayList();
    
    public void Atender(int id_caja) throws InterruptedException{
          
        esperando.acquire();
        if(id_caja==1){           
            caja1.acquire();
            int id_cl=colaArray.get(0);
            colaArray.remove(0);
            System.out.println("La caja" +id_caja+ " preparada para atender al cliente" +id_cl);
            System.out.println("La caja" +id_caja+ " atendiendo a cliente" +id_cl);
            contador1++;
            caja1.release();                       
        }
        if(id_caja==2){
            caja2.acquire();
            int id_cl=colaArray.get(0);
            colaArray.remove(0);
            System.out.println("La caja" +id_caja+ " preparada para atender al cliente" +id_cl);
            System.out.println("La caja" +id_caja+ " atendiendo a cliente" +id_cl);
            contador2++;
            caja2.release();         
        }
             
        if((contador1 + contador2)==5){
            System.out.println("La caja1 ha terminado su trabajo. Es atendido a " +contador1+ "clientes");
            System.out.println("La caja2 ha terminado su trabajo. Es atendido a " +contador2+ "clientes");
            System.out.println("Trabajo terminado. SE CIERRAN LAS CAJAS.");
            
        } 
    }
    
    public void serAtendido(int id_cl) throws InterruptedException{
        mutex.acquire();
            colaArray.add(id_cl);
            esperando.release();
        mutex.release();
    }

    void serAtendido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
}

   

  
    
    
    
    

