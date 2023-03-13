/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import strategy.Comportamientos.Disparar.NoDisparar;
import strategy.Comportamientos.Navegar.NavegarRemando;

/**
 *
 * @author jflores
 */
public class Kayak extends Barco {

    public Kayak() {
        this.comportamientoNavegar = new NavegarRemando();
        this.comportamientoDisparar = new NoDisparar();
    }
    
    @Override
    public void graficar() {
        System.out.println("   0");
        System.out.println("\\-/---/");
        System.out.println("~~~~~~~");
    }
    
}
