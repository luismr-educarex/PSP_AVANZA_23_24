package unidad1.entregas.laura_abelenda_mejias;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laura Abelenda
 */
public class AleatorioNumeros {
    Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        //ProcessBuilder pb;
       
        int numero;
        for(int i=0;i<40;i++){
            numero=(int) (Math.random()*100+1);
           
            System.out.println(numero);
            
        }   
    }
}
