/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_13_polimorfismo_2;

/**
 *
 * @author alex_
 */
public class Persona implements MostrarDatos{
    private String nombre;

private String apellido;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona() {
    }
    
@Override
    public String toString(){
    return nombre + " "  + apellido;
}

    @Override
    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre + "\n" + 
                "Apellidos: " + apellido);
    }
}

