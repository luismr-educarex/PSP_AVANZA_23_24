/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad1;

/**
 *
 * @author Luis
 */
public class ProcesoPrincipal {
    
     public static void main(String[] args) {
       
         Process nuevoProceso; //Definimos una variable de tipo Process
        try{
            //Obtenemos el nombre del SO
            String osName = System.getProperty("os.name");
            
            if (osName.toUpperCase().contains("WIN")){ //Windows
                nuevoProceso = Runtime.getRuntime().exec("java -jar "+
                    "C:\\Users\\Luis\\Documents\\NetBeansProjects\\PSP\\src\\unidad1\\ProcesoSecundario.jar");
            }else{                                      //Linux
              nuevoProceso = Runtime.getRuntime().exec("java -jar "+
              "/home/usuario/NetBeansProjects/Editor/dist/DocumentEditor.jar");
            }
           
        }catch (SecurityException ex){
            System.out.println("Ha ocurrido un error de Seguridad."+
                    "No se ha podido crear el proceso por falta de permisos.");
        }catch (Exception ex){
            System.out.println("Ha ocurrido un error, descripción: "+
                    ex.toString());
        }
    }
    
}
