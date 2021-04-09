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
public class EjemploSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char signo;
        double n1,n2, resultado;
        System.out.print("Introduzca un signo aritmetico (+, -,*,/ ) segun necesite: ");
        signo = Entrada.caracter();
        System.out.println("Introduzca un numero : ");
        n1 = Entrada.real();
        System.out.println("Introduzca otro numero : ");
        n2 = Entrada.real();
        switch(signo){
            case '+':
                resultado = n1 + n2;
                System.out.println("El resultado de la suma es : " + resultado);
                break;
            case '-':
                resultado = n1 - n2;
                System.out.println("El resultado de la resta es : " + resultado);
                break;
            case '/':
                resultado = n1 / n2;
                System.out.println("El resultado de la division es : " + resultado);
                break;
            case '*':
                resultado = n1 * n2;
                System.out.println("El resultado de la multiplicacion es : " + resultado);
                break;
            default:
                System.out.println("No se a reconocido el signo");
                break;
        }
    }
    
}
