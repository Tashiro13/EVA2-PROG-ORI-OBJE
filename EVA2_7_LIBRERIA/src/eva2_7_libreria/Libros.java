/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_7_libreria;

/**
 *
 * @author alex_
 */
public class Libros extends Publicaciones {
    private String autor;
//Regla: siempre llama al constructor de la super clase 
    public Libros() {
        super();
        this.autor = "------";
        
    }
//
    public Libros(String autor, String titulo, double precio, int copias) {
        super(titulo, precio, copias);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public void ordenarCopias(int cant){
    int existencias = getCopias();
    setCopias(existencias + cant);
    }
    
    @Override
    public void imprimirDatos(){
    super.imprimirDatos();
        System.out.println("Autor: " + autor);
    }
}
