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
public class Ejercicio {
    private String nombre;
    private String carrera;
    public static final int ingreso = 2020;
    public static final String tipo1 = "Pregrado";
    public static final String tipo2 = "Posgrado";

    
    public static String medicina(){
        return "La carrera dura 7 años";
    }
    public static String ingenieria(){
        return "La carrera dura 5 años";
    }
    public static String maestria(){
        return "La carrera dura 4 años";
    }
    public static String Posgrado(){
        return "El posgrado dura 2 años";
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getCarrera(){
        return carrera;
    }
    public void setCarrera(String carrera){
        this.carrera = carrera;
    }
}
