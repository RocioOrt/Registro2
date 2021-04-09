/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5;

/**
 *
 * @author Rocio
 */
public class EjerWhile1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        System.out.print("Introduzca un numero: ");
        num = Entrada.entero();
        while(num!=0)
        {
            if(num>0)
                System.out.println("Positivo");
            else
                System.out.println("Negativo");
            
                System.out.print("Introduzca otro numero: ");
                num = Entrada.entero();
                
        }
                
    }
    
}
