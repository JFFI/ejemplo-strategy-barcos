/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import strategy.Comportamientos.Disparar.DispararCanion;
import strategy.Comportamientos.Navegar.NavegarAVela;

/**
 *
 * @author jflores
 */
public class Buque extends Barco {

    public Buque() {
        this.comportamientoNavegar = new NavegarAVela();
        this.comportamientoDisparar = new DispararCanion();
    }
    
    @Override
    public void graficar() {
        System.out.println("  <|");
        System.out.println("  <|");
        System.out.println("\\-----/");
        System.out.println(" \\---/");
        System.out.println("~~~~~~~");
    }
    
}
