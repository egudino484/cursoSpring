/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.listas;

import java.util.List;

/**
 *
 * @author admin
 */
public class SLCiudad {
    private String nombre ;
    private List<SLAcademia> listAcademia;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<SLAcademia> getListAcademia() {
        return listAcademia;
    }

    public void setListAcademia(List<SLAcademia> listAcademia) {
        this.listAcademia = listAcademia;
    }
            
}
