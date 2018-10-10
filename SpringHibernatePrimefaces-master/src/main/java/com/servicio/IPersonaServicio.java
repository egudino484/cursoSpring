/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servicio;

import com.modelo.Persona;
import java.util.List;

/**
 *
 * @author Lorena
 */
public interface IPersonaServicio {
    
   public List<Persona>  listarPersonas();
   Persona recuperarPersonaPorId (int idPersona);
   public void agregarPersona  (Persona persona);
   public void modificarPersona  (Persona persona);
   public void eliminarPersona  (Persona persona);
   
    
}
