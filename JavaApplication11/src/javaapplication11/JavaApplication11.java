/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

/**
 *
 * @author Alriosa
 */
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int cont = 0;
        double num = 555;
        
        
        
        while(num>0){
        
            num = num/10;
            cont=cont+1;
        }
        
        System.out.println("EL numero de digitos pendejos es: " + cont);
    }
    
}
