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
public class EjemploWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char respuesta;
        System.out.println("Introduzca la letra que corresponde a la respuesta correcta : ");
        System.out.println("El color Cafe es un color : ");
        System.out.println("a) Color primario ");
        System.out.println("b) Color secundario ");
        System.out.println("c) Color terceario");
        respuesta = Entrada.caracter();
        while('c' != respuesta)
        {
                System.out.print("Respuesta incorrecta, intente otra vez: ");
                respuesta = Entrada.caracter();
                
        }
        System.out.print("Respuesta correcta!!!");
        
    }
    
}
