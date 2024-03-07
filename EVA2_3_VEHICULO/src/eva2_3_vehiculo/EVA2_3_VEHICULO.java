/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_vehiculo;

/**
 *
 * @author alex_
 */
public class EVA2_3_VEHICULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo carro1 = new Vehiculo();
        carro1.imprimirdatos();
        
        Vehiculo carro2 = new Vehiculo("Nissan","March", 2022, "Azul");
        carro2.imprimirdatos();
    }
    
}
