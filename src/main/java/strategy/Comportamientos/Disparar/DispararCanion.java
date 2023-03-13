/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.Comportamientos.Disparar;

/**
 *
 * @author jflores
 */
public class DispararCanion implements Disparar {

    @Override
    public void disparar() {
        System.out.println("Disparando cañon");
        System.out.println("¡Fuego!");
    }
    
}
