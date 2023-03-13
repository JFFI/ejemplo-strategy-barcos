/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import strategy.Comportamientos.Disparar.Disparar;
import strategy.Comportamientos.Navegar.Navegar;

/**
 *
 * @author jflores
 */
public abstract class Barco {
    protected Navegar comportamientoNavegar;
    protected Disparar comportamientoDisparar;
    
    public void navegar() {
        this.comportamientoNavegar.navegar();
    }
    
    public void disparar() {
        this.comportamientoDisparar.disparar();
    }
    
    public abstract void graficar();

    public Navegar getComportamientoNavegar() {
        return comportamientoNavegar;
    }

    public void setComportamientoNavegar(Navegar comportamientoNavegar) {
        this.comportamientoNavegar = comportamientoNavegar;
    }

    public Disparar getComportamientoDisparar() {
        return comportamientoDisparar;
    }

    public void setComportamientoDisparar(Disparar comportamientoDisparar) {
        this.comportamientoDisparar = comportamientoDisparar;
    }
}
