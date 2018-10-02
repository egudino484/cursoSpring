package com.presentacion;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import com.modelo.Persona;
import com.servicio.IPersonaServicio;
import org.springframework.dao.DataAccessException;

@ManagedBean(name = "presentacionPersona")
@RequestScoped //(Ámbito de Petición):
public class PresentacionPersona {

    private static final long serialVersionUID = 1L;
    private static final String SUCCESS = "success";
    private static final String ERROR = "error";

    //Spring Inyeccion de dependencia
    @ManagedProperty(value = "#{IPersonaServicioImpl}")
    IPersonaServicio iPersonaServicio;

    List<Persona> listaPersona;

    private int idPersona;
    private String nombres;
    private String apellidos;
    private String direccionDomicilio;

    public String guardarPersona() {
        try {
            Persona persona = new Persona();
            persona.setIdPersona(getIdPersona());
            persona.setNombres(getNombres());
            persona.setApellidos(getApellidos());
            persona.setDireccionDomicilio(getDireccionDomicilio());
            getiPersonaServicio().agregarPersona(persona);
            return SUCCESS;
        } catch (DataAccessException e) {
            e.printStackTrace();
        }

        return ERROR;
    }
    public void reset() {
        this.setApellidos("");
        this.setNombres("");
        this.setDireccionDomicilio("");
    }
    public List<Persona> getListaPersonas() {
        listaPersona = new ArrayList<Persona>();
        listaPersona.addAll(getiPersonaServicio().listarPersonas());
        return listaPersona;
    }
    public void setListaPersona(List<Persona> listaPersona) {
        this.listaPersona = listaPersona;
    }
    public IPersonaServicio getiPersonaServicio() {
        return iPersonaServicio;
    }
    public void setiPersonaServicio(IPersonaServicio iPersonaServicio) {
        this.iPersonaServicio = iPersonaServicio;
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
}
