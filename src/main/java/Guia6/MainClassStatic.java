/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia6;

/**
 *
 * @author Rocio
 */
public class MainClassStatic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println(Coche.numeroRuedas);
        System.out.println("El coche tiene su timon del lado : " + Coche.timon );
        
        System.out.println("El metodo retorna : " + Coche.arrancar());
        System.out.println("El metodo retorna : " + Coche.combustible());
        System.out.println("El metodo retorna : " + Coche.frenar());
        System.out.println("El metodo retorna : " + Coche.girar());
        
        Coche toyota = new Coche();
        toyota.setColor("Rojo");
        System.out.println("El color del carro es : " + toyota.getColor());
        
        toyota.setVelocidad(100);
        System.out.println("La velocidad maxima del carro es : " + toyota.getVelocidad());
        
        toyota.setTamaño(7);
        System.out.println("El tamaño del carro es : " + toyota.getTamaño());
        
        if (toyota instanceof Coche){
            System.out.println("En efecto toyota es una instancia de coche");
        }else{
            System.out.println("En efecto toyota no es una instancia de coche");
        
        }
        
    }
    
}
