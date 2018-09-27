/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring;

import java.util.Date;

/**
 *
 * @author admin
 */
public class Persona {
    private int id;
    private String nombre;
    private Date fechaNaicmiento;

    public Persona() {
    }

    public Persona(int id, String nombre, Date fechaNaicmiento) {
        this.id = id;
        this.nombre = nombre;
        this.fechaNaicmiento = fechaNaicmiento;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNaicmiento() {
        return fechaNaicmiento;
    }

    public void setFechaNaicmiento(Date fechaNaicmiento) {
        this.fechaNaicmiento = fechaNaicmiento;
    }
    
    
    
}
