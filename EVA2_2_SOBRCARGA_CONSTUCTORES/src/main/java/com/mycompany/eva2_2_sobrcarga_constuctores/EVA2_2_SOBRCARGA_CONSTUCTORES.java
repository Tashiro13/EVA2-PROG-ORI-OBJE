/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_2_sobrcarga_constuctores;

/**
 *
 * @author alex_
 */
public class EVA2_2_SOBRCARGA_CONSTUCTORES {

    public static void main(String[] args) {
     Persona perso1 = new Persona();
     perso1.imprimirdatos();
     
     Persona perso2 = new Persona("Pedro", "Paramo", 70);
     perso2.imprimirdatos();
     perso2.setNombre("Juan");
     perso2.setApellido("Rulfo");
     perso2.setEdad(80);
     perso2.imprimirdatos();
     
    }
}
