/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_14_vehiculos;

/**
 *
 * @author alex_
 */
public class Automovil extends Vehiculo {
    private int puertas;

    public Automovil() {
        super();
    }

    public Automovil(int puertas) {
        this.puertas = puertas;
    }

    public Automovil(int puertas, int velocidad) {
        super(velocidad);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    
    
    
    
    
}
