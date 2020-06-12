/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6_jarodzuniga_s7;

import java.util.ArrayList;

/**
 *
 * @author Jhon Zuniga
 */
public class Universo {
    protected String nombreU;
    protected ArrayList seres;

    public Universo() {
    }

    public Universo(String nombre, ArrayList seres) {
        this.nombreU = nombreU;
        this.seres = seres;
    }

    public String getNombreU() {
        return nombreU;
    }

    public void setNombreU(String nombre) {
        this.nombreU = nombreU;
    }

    public ArrayList getSeres() {
        return seres;
    }

    public void setSeres(ArrayList seres) {
        this.seres = seres;
    }

    @Override
    public String toString() {
        return "nombre=" + nombreU + ", seres=" + seres;
    }

    
    
    
}
