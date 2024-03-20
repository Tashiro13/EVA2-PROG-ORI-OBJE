/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_10_interfaces;

/**
 *
 * @author alex_
 */
public class Estudiante extends Persona implements Datos, GenerarFecha{
    private String noComtrol;

    public Estudiante() {
        super();
        this.noComtrol = "----";
    }

    public Estudiante(String noComtrol) {
        this.noComtrol = noComtrol;
    }

    public Estudiante(String noComtrol, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.noComtrol = noComtrol;
    }

    public String getNoComtrol() {
        return noComtrol;
    }

    public void setNoComtrol(String noComtrol) {
        this.noComtrol = noComtrol;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellidos: " + getApellido());
        System.out.println("Edad: " + getEdad());
        System.out.println("Annio de nacimiento: " + calcularAnnioNac());
    }

    @Override
    public String generarNombrecom() {
        return getNombre() + "  " + getApellido();
    }

    @Override
    public int calcularAnnioNac() {
        return + 2024 - getEdad();
    }

    
}
