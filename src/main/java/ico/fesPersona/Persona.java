/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fesPersona;

/**
 *
 * @author Eduardo V
 */
public class Persona {
    private String nombre;
    private int edad;
    private String sexo;

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void comer(){
        System.out.println(this.nombre + " está comiendo...");
    }
    
    public void caminar(){
        System.out.println(this.nombre + "está caminando...");
    }

    @Override
    public String toString() {
        String res="Nombre:"+this.nombre +"\n";
        res=res + "Edad:"+this.edad +"\n";
        res = res +"Sexo:"+this.sexo+" Mts.\n";
    
        return res;
    }
}
