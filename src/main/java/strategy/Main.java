/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import strategy.Comportamientos.Disparar.*;
import strategy.Comportamientos.Navegar.*;

/**
 *
 * @author jflores
 */
public class Main {
    public static void main(String args[]) throws IOException, Exception {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in)
        );
        System.out.println("Ejemplo patrón Strategy");
        System.out.println("Seleccione una acción");
        Barco barco = new Buque();
        while(true) {
            System.out.println("Barco actual:" + barco.getClass());
            listarAcciones();
            String accion = reader.readLine();
            switch(accion) {
                case "1":
                    barco.graficar();
                    break;
                case "2":
                    barco.navegar();
                    break;
                case "3":
                    barco.disparar();
                    break;
                case "4":
                    barco.comportamientoNavegar = seleccionarNavegacion(reader);
                    break;
                case "5":
                    barco.comportamientoDisparar = seleccionarCanion(reader);
                    break;
                case "6":
                    barco = seleccionarBarco(reader);
                    break;
                case "7":
                    System.exit(0);
                default:
                    System.out.println("No se reconoce número");
            }
            System.out.println("");
        }
    }
    
    public static Navegar seleccionarNavegacion(BufferedReader reader) throws Exception {
        listarNavegacion();
        String accion = reader.readLine();
        switch(accion) {
            case "1":
                return new NavegarAVela();
            case "2":
                return new NavegarRemando();
            case "3":
                return new Levitar();
            default:
                throw new Exception("No se reconoce el número");
        }
    }
    
    public static Disparar seleccionarCanion(BufferedReader reader) throws Exception {
        listarCanion();
        String accion = reader.readLine();
        switch(accion) {
            case "1":
                return new DispararCanion();
            case "2":
                return new NoDisparar();
            default:
                throw new Exception("No se reconoce el número");
        }
    }
    
    public static Barco seleccionarBarco(BufferedReader reader) throws Exception {
        listarBarcos();
        String accion = reader.readLine();
        switch(accion) {
            case "1":
                return new Buque();
            case "2":
                return new Carabela();
            case "3":
                return new Kayak();
            case "4":
                return new BarcoFantasma();
            default:
                throw new Exception("No se reconoce el número");
        }
    }
    
    public static void listarAcciones() {
        System.out.println("Ingrese un número");
        System.out.println("1 - Graficar barco actual");
        System.out.println("2 - Navegar");
        System.out.println("3 - Disparar");
        System.out.println("4 - Cambiar navegación");
        System.out.println("5 - Cambiar cañon");
        System.out.println("6 - Cambiar barco");
        System.out.println("7 - Salir");
    }
    
    public static void listarNavegacion() {
        System.out.println("Ingrese un número");
        System.out.println("1 - Navegar con vela");
        System.out.println("2 - Navegar con remos");
        System.out.println("3 - Levitar como fantasma");
    }
    
    public static void listarCanion() {
        System.out.println("Ingrese un número");
        System.out.println("1 - Con cañon");
        System.out.println("2 - Sin cañon");
    }
    
    public static void listarBarcos() {
        System.out.println("Ingrese un número");
        System.out.println("1 - Buque");
        System.out.println("2 - Carabela");
        System.out.println("3 - Kayak");
        System.out.println("4 - Barco fantasma");
    }
}
