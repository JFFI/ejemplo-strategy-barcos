/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import strategy.Comportamientos.Disparar.NoDisparar;
import strategy.Comportamientos.Navegar.Levitar;

/**
 *
 * @author jflores
 */
public class BarcoFantasma extends Barco {

    public BarcoFantasma() {
        this.comportamientoNavegar = new Levitar();
        this.comportamientoDisparar = new NoDisparar();
    }
    
    @Override
    public void graficar() {
        System.out.println("~ <|");
        System.out.println("   | * ~");
        System.out.println("\\- ---/");
        System.out.println(" \\__ /");
        System.out.println(" *    -");
        System.out.println("~~~~~~~");
    }
    
}
