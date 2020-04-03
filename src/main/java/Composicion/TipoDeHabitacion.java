/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composicion;

/**
 *
 * @author Eduardo V
 */
public class TipoDeHabitacion {
    String Habitacion;
    String Descripcion;
    Float  Precio;
    
    public TipoDeHabitacion() {
        
    }

    public String getHabitacion() {
        return Habitacion;
    }

    public void setHabitacion(String Habitacion) {
        this.Habitacion = Habitacion;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public Float getPrecio() {
        return Precio;
    }

    public void setPrecio(Float Precio) {
        this.Precio = Precio;
    }

    @Override
    public String toString() {
        return "\n Habitacion = " + Habitacion + "\n Descripcion = " + Descripcion + "\n Precio = $ " + Precio;
    }
    
}
