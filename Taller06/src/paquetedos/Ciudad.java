/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetedos;

/**
 *
 * @author darav
 */
public class Ciudad {

    private String nombreCiudad;
    private String provinciaCiudad;

    public Ciudad() {
        nombreCiudad = "NN";
        provinciaCiudad = "NN";
    }

    public Ciudad(String n, String p) {
        nombreCiudad = n;
        provinciaCiudad = p;
    }

    public void establecerNombreCiudad(String n) {
        nombreCiudad = n;
    }

    public void establecerProvinciaCiudad(String n) {
        provinciaCiudad = n;
    }
    public String obtenerNombreCiudad(){
        return nombreCiudad;
    }
    public String obtenerProvinciaCiudad(){
        return provinciaCiudad;
    }
}
