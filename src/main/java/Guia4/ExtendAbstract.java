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
public class ExtendAbstract extends AbstractEJ1 {

    @Override
    public int CuadradoArea(int a) {
        return (a * a) ;
    }

    @Override
    public int CuadradoPerimetro(int a) {
        return 4 * a;
    }

    @Override
    public int CuboArea(int a) {
        return 6 * (a * a);
    }

    @Override
    public int CuboVolumen(int a) {
        return (a * a * a);       
    }
    
}
