/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TipoDeVista;

import java.util.Set;

/**
 *
 * @author Eduardo V
 */
public class Vista {
    Float VistaAlMar;
    Float VistaAlCampoDeGolf;

    public Vista() {
    }

    public Float getVistaAlMar() {
        return VistaAlMar;
    }

    public void setVistaAlMar(Float VistaAlMar) {
        this.VistaAlMar = VistaAlMar;
    }

    public Float getVistaAlCampoDeGolf() {
        return VistaAlCampoDeGolf;
    }

    public void setVistaAlCampoDeGolf(Float VistaAlCampoDeGolf) {
        this.VistaAlCampoDeGolf = VistaAlCampoDeGolf;
    }

    @Override
    public String toString() {
        return "Costos Extras:\n"+"VistaAlMar = $ " + VistaAlMar + "\nVistaAlCampoDeGolf = $ " + VistaAlCampoDeGolf;
    }
   
   
}
