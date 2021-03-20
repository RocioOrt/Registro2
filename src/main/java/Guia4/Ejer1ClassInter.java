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
public class Ejer1ClassInter implements Ejer1Interface {

    @Override
    public int RectanguloArea(int altura, int base) {
        return base * altura;
    }

    @Override
    public int RectanguloPerimetro(int altura, int base) {
        return 2 * (base + altura);
    }

    @Override
    public int OrtoedroArea(int ancho, int largo, int altura) {
        return 2 * ((ancho * largo) + (ancho * altura) + (largo * altura)); 
    }

    @Override
    public int OrtoedroVolumen(int ancho, int largo, int altura) {
        return (ancho * largo * altura);
    }
    
}
