/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.Comportamientos.Navegar;

/**
 *
 * @author jflores
 */
public class Levitar implements Navegar {

    @Override
    public void navegar() {
        System.out.println("Flotando sobre el agua...");
    }
    
}
