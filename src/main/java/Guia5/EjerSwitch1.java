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
public class EjerSwitch1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota;
        System.out.print("Introduzca una nota: ");
        nota = Entrada.entero();
        switch(nota){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Insuficiente");
                break;
            case 5:
                System.out.println("Suficiente");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7:
            case 8:
                System.out.println("Notable");
                break;
            case 9:
            case 10:
                System.out.println("sobresaliente");
                break;
            default:
                System.out.println("Error");
                break;
                 
        }
    }
    
}
