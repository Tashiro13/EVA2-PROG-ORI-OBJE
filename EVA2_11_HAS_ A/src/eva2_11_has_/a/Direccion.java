/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_11_has_.a;

/**
 *
 * @author alex_
 */
public class Direccion {
    private String calle;
    private String numero;
    private String colonia;
    private String cp;
    private String cuidad;
    private String estado;

    public Direccion() {
        this.calle = "-------";
        this.numero = "-------";
        this.colonia = "-------";
        this.cp = "-------";
        this.cuidad = "-------";
        this.estado = "-------";
    }

    public Direccion(String calle, String numero, String colonia, String cp, String cuidad, String estado) {
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.cp = cp;
        this.cuidad = cuidad;
        this.estado = estado;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getCuidad() {
        return cuidad;
    }

    public void setCuidad(String cuidad) {
        this.cuidad = cuidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setDireccion(String estado) {
        this.estado = estado;
    }
    
    @Override
    public String toString(){
    String cade = "Calle: " + calle + " #" + numero + "\n" +
                   "Colonia: " + colonia + " , C.P.: " + cp+ "\n" +
                   "Ciudad: " + cuidad + "  Estado: " + estado;
    return cade;
    }
}
