/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presentacion;

import com.modelo.Persona;
import com.servicio.IPersonaServicio;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

/**
 *
 * @author admin
 */
@ManagedBean(name = "PresentacionPersona")
public class PresentacionPersona {

    private static final long serialVersion = 1;
    private static final String Exitoso = "exitoso";
    
    private static final String INDEX = "index.xhtml";
    private static final String ERROR = "error.xhtml";
    
    @ManagedProperty(value = "#{IPersonaServicioImpl}")
    IPersonaServicio iPersonaServicio;
    List<Persona> listaPersona;
    
    private int idPersona;
    private String nombres;
    private String apellidos;
    private String direccionDomicilio;
    
    public String guardarPersona() {
        try {
            Persona p = new Persona();
            p.setIdPersona(idPersona);
            p.setApellidos(apellidos);
            p.setNombres(nombres);
            p.setDireccionDomicilio(direccionDomicilio);
             getiPersonaServicio().agregarPersona(p);
        return Exitoso;
        } catch (Exception e) {
            
            System.err.println("error:"+ e.getMessage());
            return ERROR;
        }
        
    }
      public String actualizarPersona() {
        try {
            Persona p = new Persona();
            p.setIdPersona(idPersona);
            p.setApellidos(apellidos);
            p.setNombres(nombres);
            p.setDireccionDomicilio(direccionDomicilio);
             getiPersonaServicio().modificarPersona(p);
        return Exitoso;
        } catch (Exception e) {
            
            System.err.println("error:"+ e.getMessage());
            return ERROR;
        }
        
    }
public void reset(){

this.setApellidos("");
this.setNombres("");
this.setDireccionDomicilio("");
this.setIdPersona(-1);
}

public List<Persona> getListapersonas(){
listaPersona= new ArrayList<>();
listaPersona.addAll(getiPersonaServicio().listarPersonas());
return  listaPersona;
}
      public String eliminarPersona() {
        try {
            Persona p = new Persona();
            p.setIdPersona(idPersona);
             getiPersonaServicio().eliminarPersona(p);
        return Exitoso;
        } catch (Exception e) {
            
            System.err.println("error:"+ e.getMessage());
            return ERROR;
        }
        
    }
     public void buscar(){
     
         try {
             Persona persona= getiPersonaServicio().recuperarPersonaPorId(getIdPersona());
             idPersona=persona.getIdPersona();
             nombres= persona.getNombres();
             apellidos= persona.getApellidos();
             direccionDomicilio= persona.getDireccionDomicilio();
             
         } catch (Exception e) {
         }
     }    
        public  String listar(){
        
        return Exitoso;
        }
        
    public IPersonaServicio getiPersonaServicio() {
        return iPersonaServicio;
    }
    
    public void setiPersonaServicio(IPersonaServicio iPersonaServicio) {
        this.iPersonaServicio = iPersonaServicio;
    }
    
    public List<Persona> getListaPersona() {
        return listaPersona;
    }
    
    public void setListaPersona(ArrayList<Persona> listaPersona) {
        this.listaPersona = listaPersona;
    }
    
    public int getIdPersona() {
        return idPersona;
    }
    
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }
    
    public String getNombres() {
        return nombres;
    }
    
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    
    public String getApellidos() {
        return apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    public String getDireccionDomicilio() {
        return direccionDomicilio;
    }
    
    public void setDireccionDomicilio(String direccionDomicilio) {
        this.direccionDomicilio = direccionDomicilio;
    }

    public void setListaPersona(List<Persona> listaPersona) {
        this.listaPersona = listaPersona;
    }
    
}
