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
public class Ejer1MainInter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Ejer1ClassInter PruebaRectanguloOrtoedro = new Ejer1ClassInter ();
        System.out.println("El area del rectangulo es : " + PruebaRectanguloOrtoedro.RectanguloArea(2,5));
        System.out.println("El perimetro del rectangulo es : " + PruebaRectanguloOrtoedro.RectanguloPerimetro(2, 5));
        System.out.println("El area del ortoedro es : " + PruebaRectanguloOrtoedro.OrtoedroArea(3, 7, 5));
        System.out.println("El volumen del ortoedro es : " + PruebaRectanguloOrtoedro.OrtoedroVolumen(3, 7, 5));
    }
    
}
