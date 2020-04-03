/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registro;

import TipoDeVista.Vista;
import Composicion.TipoDeHabitacion;
import ico.fesPersona.Persona;
/**
 *
 * @author Eduardo V
 */
public class  RegistroHotel {
     public static void main(String[] args) {
         TipoDeHabitacion Opcion1=new TipoDeHabitacion();
        Opcion1.setHabitacion("Sencilla");
        Opcion1.setPrecio(1600.0f);
        Opcion1.setDescripcion("(cama matrimonial)");
        TipoDeHabitacion Opcion2=new TipoDeHabitacion();
        Opcion2.setHabitacion("Doble");
        Opcion2.setPrecio(2650.0f);
        Opcion2.setDescripcion("(Dos camas matrimoniales)");               
                TipoDeHabitacion Opcion3=new TipoDeHabitacion();
        Opcion3.setHabitacion("Suite");
        Opcion3.setPrecio(4890.0f);
        Opcion3.setDescripcion("(mini bar, jacuzzi cama King size)");   
                TipoDeHabitacion Opcion4=new TipoDeHabitacion();
        Opcion4.setHabitacion("King");
        Opcion4.setPrecio(6250.0f);
        Opcion4.setDescripcion("(sala, mini bar, alberca, cama King size)");
                TipoDeHabitacion Opcion5=new TipoDeHabitacion();
        Opcion5.setHabitacion("Precidencial");
        Opcion5.setPrecio(8100.0f);
        Opcion5.setDescripcion("(recibidor, sala, bar, alberca, dos camas King size)");
                TipoDeHabitacion Opcion6=new TipoDeHabitacion();
        Opcion6.setHabitacion("Sencilla Con todo incluido");
        Opcion6.setPrecio(2200.0f);
        Opcion6.setDescripcion("(servicio a la habitación, acceso al restaurante-bar, a los conciertos y espectáculos dentro del hotel, pulsera para barra libre 24hrs,cama matrimonial)");
                TipoDeHabitacion Opcion7=new TipoDeHabitacion();
        Opcion7.setHabitacion("Doble Con todo incluido");
        Opcion7.setPrecio(3650.f);
        Opcion7.setDescripcion("(servicio a la habitación, acceso al restaurante-bar, a los conciertos y espectáculos dentro del hotel, pulsera para barra libre 24hrs,Dos camas matrimoniales");
                TipoDeHabitacion Opcion8=new TipoDeHabitacion();
        Opcion8.setHabitacion("Suite Con todo incluido");
        Opcion8.setPrecio(5960.0f);
        Opcion8.setDescripcion("(servicio a la habitación, acceso al restaurante-bar, a los conciertos y espectáculos dentro del hotel, pulsera para barra libre 24hrs,mini bar, jacuzzi cama King size");
                TipoDeHabitacion Opcion9=new TipoDeHabitacion();
        Opcion9.setHabitacion("King Con todo incluido");
        Opcion9.setPrecio(7850.0f);
        Opcion9.setDescripcion("(servicio a la habitación, acceso al restaurante-bar, a los conciertos y espectáculos dentro del hotel, pulsera para barra libre 24hrs,sala, mini bar, alberca, cama King size");
                TipoDeHabitacion Opcion10=new TipoDeHabitacion();
        Opcion10.setHabitacion("Presidencial Con todo incluido");
        Opcion10.setPrecio(9950.0f);
        Opcion10.setDescripcion("(servicio a la habitación, acceso al restaurante-bar, a los conciertos y espectáculos dentro del hotel, pulsera para barra libre 24hrs,recibidor, sala, bar, alberca, dos camas King size");
     Vista Vista1=new Vista();
     Vista1.setVistaAlCampoDeGolf(200.0f);
     Vista1.setVistaAlMar(0.0f);
     Vista Vista2=new Vista();
     Vista2.setVistaAlMar(350.0f);
     Vista2.setVistaAlCampoDeGolf(0.0f);
     Persona Huesped1=new Persona();
     Huesped1.setNombre("Juan Hernandez Garcia");
     Huesped1.setEdad(40);
     Huesped1.setSexo("Masculino");
      Persona Huesped2=new Persona();
     Huesped2.setNombre("Eduardo Vega");
     Huesped2.setEdad(19);
     Huesped2.setSexo("Masculino");
      Persona Huesped3=new Persona();
     Huesped3.setNombre("Jonathan Davis");
     Huesped3.setEdad(30);
     Huesped3.setSexo("Masculino");
     
         System.out.println("---------------------------\n");     
         System.out.println(Huesped2);
         System.out.println("Reservacion:"+Opcion10+"\n");
         System.out.println(Vista1+"\n");
         System.out.println("---------------------------\n");
         
         System.out.println(Huesped1);
         System.out.println("Reservacion:"+Opcion3+"\n");
         System.out.println(Vista2+"\n");
         System.out.println("---------------------------\n");
         
         System.out.println(Huesped3);
         System.out.println("Reservacion:"+Opcion9+"\n");
         System.out.println(Vista1+"\n");
         System.out.println("---------------------------\n");
         
        
     }
}
  
