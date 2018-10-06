/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.modelo.Persona;
import java.util.List;

/**
 *
 * @author admin
 */
public interface IPersonaDao {
    public List<Persona> listarPersonas();

    Persona recuperarPersonaPorId(int idPersona);

    Persona recuperarPersonaPorNombre(Persona persona);

    public void agregarPersona(Persona persona);

    public void modificarPersona(Persona persona);

    public void eliminarPersona(Persona persona);

    long contadorPersonas();
}
