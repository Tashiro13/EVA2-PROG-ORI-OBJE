/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_7_libreria;

/**
 *
 * @author alex_
 */
public class EVA2_7_LIBRERIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libros libro = new Libros("Juan Rulfo", "El llano en llamas", 500, 10);
        libro.imprimirDatos();
        libro.venderCopias(5);
        libro.imprimirDatos();
        libro.ordenarCopias(100);
        libro.imprimirDatos();
        libro.venderCopias(200);
        libro.imprimirDatos();
        
    }
    
}
