/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_herencia;

/**
 *
 * @author alex_
 */
public class EVA2_4_HERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso1 = new Persona();
        System.out.println(perso1.toString());
        //El metodo toString viene por herencia, no fue importada por 
        //Todas las clases en java descinden de la clase objet
        Estudiante estu1 = new Estudiante();
        System.out.println("Nombre: " + estu1.getNombre());
        System.out.println("Apellido: " + estu1.getApellido());
        System.out.println("Edad: " + estu1.getEdad());
    }
    
}

class Persona{
private String nombre;
private String apellido;
private int edad;

    public Persona() {
        this.nombre = "Sin nombre";
        this.apellido = "Sin apellido";
        this.edad = 0;
    }

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
class Estudiante extends Persona{
private String noControl;

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }


}