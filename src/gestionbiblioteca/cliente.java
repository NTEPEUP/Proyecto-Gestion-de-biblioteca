/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionbiblioteca;

import java.beans.beancontext.BeanContextMembershipEvent;

/**
 *
 * @author Nelson
 */
public class cliente {
    //clase cliente
    private String nombre;
    private String direccion;
    private String telefono;
    private String identifiacion;

    public cliente(String nombre, String direccion, String telefono, String identifiacion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.identifiacion = identifiacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getIdentifiacion() {
        return identifiacion;
    }

    public void setIdentifiacion(String identifiacion) {
        this.identifiacion = identifiacion;
    }
    
   
    
}
