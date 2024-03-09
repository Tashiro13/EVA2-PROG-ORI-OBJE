/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_5_super;

/**
 *
 * @author alex_
 */
public class Estudiante extends Persona {
    private String noControl;
    private String carrera;
    
    public Estudiante(){
    super();//Llama al constructor de la superclase
     noControl = "----------";
     carrera = "-------------";
    }
    //Regla de herencia: simpre hay que llamar al contructor de la suoerclase
    //Siempre tiene que ser la primer instruccion del constrictor
    public Estudiante(String nombre, String apPaterno, String apMaterno, int edad, char genero, String noControl, String carrera){
     super(nombre, apPaterno, apMaterno, edad, genero);
     this.noControl = noControl;
     this.carrera = carrera;
    }

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    @Override
    public void imprimirDatos(){
    super.imprimirDatos();
        System.out.println("No de Control: " + noControl);
        System.out.println("Carrera: " + carrera);
        
    }
            
}
