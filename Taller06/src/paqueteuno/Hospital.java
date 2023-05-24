/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteuno;

import paquetedos.Ciudad;
import paquetedos.Enfermero;
import paquetedos.Medico;

/**
 *
 * @author darav
 */
public class Hospital {

    private String nombreHospital;
    private Ciudad ciudad;
    private int numeroE;
    private Medico medicos;
    private Enfermero enfermero;
    private double sueldoT;
    private String direccion;

    public Hospital(String n, Ciudad c, int e, Medico m, Enfermero en, String d) {
        nombreHospital = n;
        ciudad = c;
        numeroE = e;
        medicos = m;
        enfermero = en;
        direccion = d;
    }
    
    public Hospital(){
    }
    
    public void establecerNombreHospital(String n) {
        nombreHospital = n;
    }

    public void establecerCiudad(Ciudad n) {
        ciudad = n;
    }

    public void establecerNumeroEspecialidades(int n) {
        numeroE = n;
    }

    public void establecerMedico(Medico n) {
        medicos = n;
    }

    public void establecerEnfermero(Enfermero n) {
        enfermero = n;
    }

    public void establecerDireccion(String n) {
        direccion = n;
    }

    public void calcularSueldoT(double n, double m) {
        sueldoT =  n + m; 
    }

    public String obtenerNombreHospital() {
        return nombreHospital;
    }

    public Ciudad obtenerCiudad() {
        return ciudad;
    }

    public int obtenerNumeroEspecialidades() {
        return numeroE;
    }

    public Medico obtenerMedico() {
        return medicos;
    }

    public Enfermero obtenerEnfermero() {
        return enfermero;
    }

    public String obteneDireccion() {
        return direccion;
    }

    public double obteneSueldoT() {
        return sueldoT;
    }
}
