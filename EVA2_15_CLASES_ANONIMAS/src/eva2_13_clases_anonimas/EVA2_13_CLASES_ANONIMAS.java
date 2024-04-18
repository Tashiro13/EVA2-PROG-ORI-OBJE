/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_13_clases_anonimas;

/**
 *
 * @author alex_
 */
public class EVA2_13_CLASES_ANONIMAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Prueba prueba = new Prueba(); ----> no se puden crear objetos 
        //NO SE PUEDEN OBJETOS DE INTERFACES
        //Usando polimorfismo
        Prueba prueba = new Prueba() {
            @Override
            public void Mostrarmensaje() {
                System.out.println("Hola mundo!!");
            }
        };
        prueba.Mostrarmensaje();
        
        ClaseAbstracta prueba2 = new ClaseAbstracta() {
            @Override
            public void otromensaje() {
                System.out.println("Ahora con clase abstracta");
            }
        };
        prueba2.otromensaje();
        prueba2.mensaje();
    }
    
}

interface Prueba{
public void Mostrarmensaje();

}

abstract class ClaseAbstracta{
 public abstract void otromensaje();
 
 public void mensaje(){
     System.out.println("Hola mundo");
 }

}