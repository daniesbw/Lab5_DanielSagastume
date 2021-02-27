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
public class Persona {
    private String nom;
    private int num_registro;
    private String apellido;
    private String username;
    private String contraseña;
    
    public Persona() {
    }

    public Persona(String nom, int num_registro, String apellido, String username, String contraseña) {
        this.nom = nom;
        this.num_registro = num_registro;
        this.apellido = apellido;
        this.username = username;
        this.contraseña = contraseña;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNum_registro() {
        return num_registro;
    }

    public void setNum_registro(int num_registro) {
        this.num_registro = num_registro;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Persona{" + "nom=" + nom + '}';
    }
    
}
