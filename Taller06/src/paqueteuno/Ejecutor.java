/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paqueteuno;

import java.util.Locale;
import java.util.Scanner;
import paquetedos.Ciudad;
import paquetedos.Enfermero;
import paquetedos.Medico;

/**
 *
 * @author darav
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        
        Ciudad ciu = new Ciudad();
        System.out.println("Ingrese el nombre de la ciudad");
        ciu.establecerNombreCiudad(entrada.nextLine());
        System.out.println("Ingrese la provincia:");
        ciu.establecerProvinciaCiudad(entrada.nextLine());
        
        Hospital hosp = new Hospital();
        System.out.println("Ingrese el nombre del hospital:");
        hosp.establecerNombreHospital(entrada.nextLine());
        System.out.println("Ingrese la direccion del hospiital:");
        hosp.establecerDireccion(entrada.nextLine());
        System.out.println("Ingrese el numero de especialidades: ");
        hosp.establecerNumeroEspecialidades(entrada.nextInt());
        hosp.establecerCiudad(ciu);
        
        System.out.println("Ingrese el numero de medicos a registrar");
        int n = entrada.nextInt();
        entrada.nextLine();
        String cadena2 = "";
        double sueldoM = 0;
        double sueldoE = 0;
        for (int i = 0; i < n; i++) {
            Medico med = new Medico();
            System.out.println("Ingrese el nombre del medico:");
            med.establecerNombreDoctor(entrada.nextLine());
            System.out.println("Ingrese la especialidad del medico:");
            med.establecerEspecialidad(entrada.nextLine());
            System.out.println("Ingrese el sueldo mensual del medico");
            med.establecerSueldoMedico(entrada.nextDouble());
            cadena2 = cadena2 + String.format("-%s - sueldo: %.2f - %s\n",
                    med.obtenerNombreMedico(),
                    med.obtenerSueldoMedico(),
                    med.obtenerEspecialidad());
            entrada.nextLine();
            sueldoM = sueldoM + med.obtenerSueldoMedico();
        }
        System.out.println("Ingrese el numero de enfermeros a registrar");
        int m = entrada.nextInt();
        entrada.nextLine();
        String cadena3 = "";
        for (int i = 0; i < m; i++) {
            Enfermero enf = new Enfermero();
            System.out.println("Ingrese el nombre del enfermero:");
            enf.establecerNombreEnfermero(entrada.nextLine());
            System.out.println("Ingrese el tipo de contrato del enfermero:");
            enf.establecerTipo(entrada.nextLine());
            System.out.println("Ingrese el sueldo mensual del medico");
            enf.establecerSueldoEnfermero(entrada.nextDouble());
            cadena3 = cadena3 + String.format("-%s - sueldo: %.2f - %s\n",
                    enf.obtenerNombreEnfermero(),
                    enf.obtenerSueldoEnfermero(),
                    enf.obtenerTipo());
            entrada.nextLine();
            sueldoE = sueldoE + enf.obtenerSueldoEnfermero();
        }
        hosp.calcularSueldoT(sueldoE, sueldoM);
        
        System.out.printf("""
                          HOSPITAL %S
                          Direccion: %s
                          Ciudad: %s
                          Provincia: %s
                          Numero de especialidades: %s
                          Listado de medicos:
                          %s
                          Listado de enfermeros(as)
                          %s
                          Total de sueldos a pagar por mes: %.2f\n""",
                hosp.obtenerNombreHospital(),
                hosp.obteneDireccion(),
                ciu.obtenerNombreCiudad(),
                ciu.obtenerProvinciaCiudad(),
                hosp.obtenerNumeroEspecialidades(),
                cadena2,
                cadena3,
                hosp.obteneSueldoT());

    }

}
