/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetedos;

/**
 *
 * @author darav
 */
public class Enfermero {
 
    private String nombreEnfermero;
    private String tipo;
    private double sueldoE;

    public Enfermero() {
        nombreEnfermero = "NN";
        tipo = "NN";
    }

    public Enfermero(String n, String e, double s) {
        nombreEnfermero = n;
        tipo = e;
        sueldoE = s;
    }

    public void establecerNombreEnfermero(String n) {
        nombreEnfermero = n;
    }

    public void establecerSueldoEnfermero(double n) {
        sueldoE = n;
    }
    public void establecerTipo(String n) {
        tipo = n;
    }
    public String obtenerNombreEnfermero(){
        return nombreEnfermero;
    }
    public String obtenerTipo(){
        return tipo;
    }
    public double obtenerSueldoEnfermero(){
        return sueldoE;
    }
}
