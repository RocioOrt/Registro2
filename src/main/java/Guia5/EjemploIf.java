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
public class EjemploIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double cm, m, m2, peso, IMC;
        System.out.println("Introduzca su altura en centimetros(cm) : ");
        cm = Entrada.real();
        m = cm/100;
        m2 = m * m;
        System.out.println("Introduzca su peso en kilogramos(kg) : ");
        peso = Entrada.real();
        IMC = peso/m2;
        System.out.println("Su Indice de masa corporal es de " + IMC);
        if(IMC<18.5){
            System.out.println("Su peso es inferior al normal");
        } else if(IMC >= 18.5 && IMC <= 24.9){
            System.out.println("Su peso es normal");  
        } else if(IMC >= 25 && IMC <= 29.9){
            System.out.println("Su peso es superior al normal"); 
        } else
            System.out.println("Obesidad"); 
    }
    
    
}
