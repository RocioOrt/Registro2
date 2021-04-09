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
public class EjemploFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int resultado=0, tabla;
        System.out.println("Ingrese el numero del que desee conocer su tabla de multiplicacion: ");
        tabla=Entrada.entero();
        
         for(int i = 0;i<=10;i++)
         {
            resultado = tabla * i;
            System.out.println(tabla + " x "+ i + " = " + resultado);
         }
    }
    
}
