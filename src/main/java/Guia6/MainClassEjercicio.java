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
public class MainClassEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Ejercicio Alumno1 = new Ejercicio();
        Alumno1.setNombre("Pedro Perez");
        System.out.println("Nombre del alumno : " + Alumno1.getNombre());
        
        Alumno1.setCarrera("Doctorado en medicina");
        System.out.println("Carrera : " + Alumno1.getCarrera());
        
        System.out.println("Año de ingreso : " + Ejercicio.ingreso);
        System.out.println(Ejercicio.medicina());
        System.out.println("Tipo de carrera : " + Ejercicio.tipo1);
        
        if (Alumno1 instanceof Ejercicio){
            System.out.println("Se ha registrado correctamente");
        }else{
            System.out.println("No se ha registrado");
        }
        
        System.out.println("\n ----------------------- \n");
        
        Ejercicio Alumno2 = new Ejercicio();
        Alumno2.setNombre("Maria Melendez");
        System.out.println("Nombre del alumno : " + Alumno2.getNombre());
        
        Alumno2.setCarrera("Maestria en Recursos Humanos");
        System.out.println("Carrera : " + Alumno2.getCarrera());
        
        System.out.println("Año de ingreso : " + Ejercicio.ingreso);
        System.out.println(Ejercicio.maestria());
        System.out.println("Tipo de carrera : " + Ejercicio.tipo1);
        
        if (Alumno2 instanceof Ejercicio){
            System.out.println("Se ha registrado correctamente");
        }else{
            System.out.println("No se ha registrado");
        }
        
        System.out.println("\n ----------------------- \n");
        
        Ejercicio Alumno3 = new Ejercicio();
        Alumno3.setNombre("Alejandro Quintanilla");
        System.out.println("Nombre del alumno : " + Alumno3.getNombre());
        
        Alumno3.setCarrera("Ingenieria en Sistemas Computacionales");
        System.out.println("Carrera : " + Alumno3.getCarrera());
        
        System.out.println("Año de ingreso : " + Ejercicio.ingreso);
        System.out.println(Ejercicio.ingenieria());
        System.out.println("Tipo de carrera : " + Ejercicio.tipo1);
        
        if (Alumno3 instanceof Ejercicio){
            System.out.println("Se ha registrado correctamente");
        }else{
            System.out.println("No se ha registrado");
        }
        System.out.println("\n ----------------------- \n");
        Ejercicio Alumno4 = new Ejercicio();
        Alumno4.setNombre("Marta Mendez");
        System.out.println("Nombre del alumno : " + Alumno4.getNombre());
        
        Alumno4.setCarrera("Maesria en Epidemiologia");
        System.out.println("Carrera : " + Alumno4.getCarrera());
        
        System.out.println("Año de ingreso : " + Ejercicio.ingreso);
        System.out.println(Ejercicio.Posgrado());
        
        System.out.println("Tipo de carrera : " + Ejercicio.tipo2);
        
        if (Alumno4 instanceof Ejercicio){
            System.out.println("Se ha registrado correctamente");
        }else{
            System.out.println("No se ha registrado");
        }
       
    }
    
}
