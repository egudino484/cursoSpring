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

@ManagedBean(name = "presentacionPersona")
public class PresentacionPersona {

    private static final long serialversion = 1L;
    private static final String EXITOSO = "exitoso";
    private static final String ERROR = "error";
    private static final String INDEX = "index";
    
    @ManagedProperty(value="#{IPersonaServicioImpl}")
    IPersonaServicio iPersonaServicio;
    
    List<Persona> listaPersona;
    
    private int idPersona;
    private String nombres;
    private String apellidos;
    private String direccionDomicilio;
    
    public String guardarPersona(){
        try{
            Persona persona=new Persona();
            persona.setApellidos(getApellidos());
            persona.setNombres(getNombres());
            persona.setDireccionDomicilio(getDireccionDomicilio());
            getiPersonaServicio().agregarPersona(persona);
            return EXITOSO;
        }catch(Exception ex){
            System.err.println("error:"+ex.getMessage()); 
            return ERROR;
        }
    }
    public String eliminarPersona(){
        try{
            Persona persona=new Persona();
            persona.setIdPersona(getIdPersona());
            getiPersonaServicio().eliminarPersona(persona);
            return EXITOSO;
        }catch(Exception ex){
            System.err.println("error:"+ex.getMessage()); 
            return ERROR;
        }
    }
     public void buscar(){
        try{
            Persona persona=getiPersonaServicio().recuperarPersonaPorId(getIdPersona());
            idPersona=persona.getIdPersona();
            nombres=persona.getNombres();
            apellidos=persona.getApellidos();
            direccionDomicilio=persona.getDireccionDomicilio();
        }catch(Exception ex){
            System.err.println("error:"+ex.getMessage()); 
        }
    }
    public String listar(){
        return EXITOSO;
    }
     public String actualizarPersona(){
        try{
            Persona persona=new Persona();
            persona.setApellidos(getApellidos());
            persona.setNombres(getNombres());
            persona.setDireccionDomicilio(getDireccionDomicilio());
            getiPersonaServicio().modificarPersona(persona);
            return EXITOSO;
        }catch(Exception ex){
            System.err.println("error:"+ex.getMessage()); 
            return ERROR;
        }
    }
     public void reset(){
         this.setApellidos("");
         this.setDireccionDomicilio("");
         this.setNombres("");
     }
     public List<Persona> getListapersonas(){
        listaPersona=new ArrayList<Persona>();
        listaPersona.addAll(getiPersonaServicio().listarPersonas());
        return listaPersona;
     }

    public void setListaPersona(List<Persona> listaPersona) {
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

    public IPersonaServicio getiPersonaServicio() {
        return iPersonaServicio;
    }

    public void setiPersonaServicio(IPersonaServicio iPersonaServicio) {
        this.iPersonaServicio = iPersonaServicio;
    }
    
    
    
}
