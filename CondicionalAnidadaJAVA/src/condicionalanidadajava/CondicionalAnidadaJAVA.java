/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionalanidadajava;

import java.util.Scanner;

/**
 *
 * @author Alriosa
 */
public class CondicionalAnidadaJAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       
            int variable;
            int variable2;
       
            System.out.println("Ingrese un valor");
        
       
            variable = in.nextInt();
         
            if(variable==1){
               System.out.println("El numero fue 1"); 
               
               System.out.println("Ingrese otro numero");
               variable2 = in.nextInt();
               
               if(variable2>2){
               
                 System.out.println("El numero que acaba de ingresar es mayor a dos");
                   
               }
               
               else
                   
               {
                 System.out.println("El numero que acaba de ingresar es menor a dos");
               }
            }
            if(variable==2){
               System.out.println("El numero fue 2"); 
            }
            if(variable==3){
               System.out.println("El numero fue 3"); 
            }
            if(variable>=4){
               System.out.println("El numero es mayor a 3"); 
               System.out.println("El numero fue "+ variable);
            }
    }
    
}
