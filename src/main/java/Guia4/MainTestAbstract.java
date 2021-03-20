/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia4;

/**
 *
 * @author Rocio
 */
public class MainTestAbstract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ExtendAbstract PruebaCuadroCubo = new ExtendAbstract();
        System.out.println("El area del cuadrado es : " + PruebaCuadroCubo.CuadradoArea(2));
        System.out.println("El perimetro del cuadrado es : " + PruebaCuadroCubo.CuadradoPerimetro(3));
        System.out.println("El area del cubo es : " + PruebaCuadroCubo.CuboArea(4));
        System.out.println("El volumen del cubo es : " + PruebaCuadroCubo.CuboVolumen(5));
        // TODO code application logic here
    }
    
}
