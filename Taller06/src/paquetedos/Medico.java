/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetedos;

/**
 *
 * @author darav
 */
public class Medico {
    
    private String nombreMedico;
    private String especialidad;
    private double sueldoM;

    public Medico() {
        nombreMedico = "NN";
        especialidad = "NN";
    }

    public Medico(String n, String e, double s) {
        nombreMedico = n;
        especialidad = e;
        sueldoM = s;
    }

    public void establecerNombreDoctor(String n) {
        nombreMedico = n;
    }

    public void establecerSueldoMedico(double n) {
        sueldoM = n;
    }
    public void establecerEspecialidad(String n) {
        especialidad = n;
    }
    public String obtenerNombreMedico(){
        return nombreMedico;
    }
    public String obtenerEspecialidad(){
        return especialidad;
    }
    public double obtenerSueldoMedico(){
        return sueldoM;
    }
}
