/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_9_final;

/**
 *
 * @author alex_
 */
public abstract class Electronica extends Productos {
    private String marca;
    private boolean garantia;

    public Electronica() {
        this.marca = "-------";
        this.garantia = false;
    }

    public Electronica(String marca, boolean garantia) {
        super();
        this.marca = marca;
        this.garantia = garantia;
    }

    public Electronica(String marca, boolean garantia, String nombre, double precio) {
        super(nombre, precio);
        this.marca = marca;
        this.garantia = garantia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isGarantia() {
        return garantia;
    }

    public void setGarantia(boolean garantia) {
        this.garantia = garantia;
    }
    
    @Override
     public String toString(){ 
     String code = super.toString() + "\n";
     code += "Marca: " + marca + "\n" +
                   "Garantia: " + garantia;
     return code;
     }
    
}
