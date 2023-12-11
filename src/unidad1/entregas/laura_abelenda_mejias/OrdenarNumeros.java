package unidad1.entregas.laura_abelenda_mejias;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laura Abelenda
 */
public class OrdenarNumeros {
    
    public static void main(String[] args){
        
        try{
            InputStreamReader isr=new InputStreamReader(System.in);
            BufferedReader bf=new BufferedReader(isr);
            
            String inputStr=null;
            while( (inputStr=bf.readLine()) !=null){
                String datos[] = inputStr.split(" ");
                int numeros[] = new int[datos.length];
                for (int i = 0; i < numeros.length; i++) {
                    numeros[i]=Integer.parseInt(datos[i]);                   
                }
                Arrays.sort(numeros);
                for (int i = 0; i < numeros.length; i++) {
                    System.out.println(numeros[i] + " ");                  
                }
                System.out.println("");
            }
        }catch(IOException ex){
            Logger.getLogger(OrdenarNumeros.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        /**
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = "";
        ArrayList<Integer> numero=new ArrayList<Integer>();
        while(inputStr!=null){
            try{
                if((inputStr=br.readLine()) != null) {
                    //System.out.println("Received Input => " + inputStr);
                    numero.add(Integer.parseInt(inputStr));
                }
            }catch (Exception e) {
                e.printStackTrace();
                break;
            }
        }
        Collections.sort(numero);
        //si quisieramos ordenarlo en order inverso, añadir las siguientes 2 lineas
        //Comparator<Integer> comparador = Collections.reverseOrder();
        //Collections.sort(miLista, comparador);
        System.out.println("lista de numeros ordenados");
        for(int i=0;i<numero.size();i++){
            System.out.print(numero.get(i)+"    ");
        } 
        */
   
    }
    
}
