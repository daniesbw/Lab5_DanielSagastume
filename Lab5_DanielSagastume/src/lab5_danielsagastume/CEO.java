/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_danielsagastume;

/**
 *
 * @author Daniel
 */
public class CEO extends Persona{
    private String nacionalidad;
    private String titulo;
    private int edad;
    private int anios_exp;
    private int cant_anios;

    public CEO() {
        super();
    }

    public CEO(String nacionalidad, String titulo, int edad, int anios_exp, int cant_anios, String nom, int num_registro, String apellido, String username, String contraseña) {
        super(nom, num_registro, apellido, username, contraseña);
        this.nacionalidad = nacionalidad;
        this.titulo = titulo;
        this.edad = edad;
        this.anios_exp = anios_exp;
        this.cant_anios = cant_anios;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAnios_exp() {
        return anios_exp;
    }

    public void setAnios_exp(int anios_exp) {
        this.anios_exp = anios_exp;
    }

    public int getCant_anios() {
        return cant_anios;
    }

    public void setCant_anios(int cant_anios) {
        this.cant_anios = cant_anios;
    }

    @Override
    public String toString() {
        return "CEO{" + '}';
    }
    
}
