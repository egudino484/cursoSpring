/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servicio;

import com.dao.IPersonaDao;
import com.modelo.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("IPersonaServicioImpl")
public class IPersonaServicioImpl implements IPersonaServicio {

    @Autowired
    IPersonaDao iPersonaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Persona> listarPersonas() {
        try {
            return getiPersonaDao().listarPersonas();
        } catch (Exception ex) {
            System.err.println("error." + ex.getMessage());
            return null;
        }
    }

    @Override
    @Transactional(readOnly = true)
    public Persona recuperarPersonaPorId(int idPersona) {
        try {
            Persona persona = getiPersonaDao().recuperarPersonaPorId(idPersona);
            return persona;
        } catch (Exception ex) {
            System.err.println("error." + ex.getMessage());
            return null;
        }
    }

    @Override
    @Transactional
    public void agregarPersona(Persona persona) {
        try {
            getiPersonaDao().agregarPersona(persona);

        } catch (Exception ex) {
            System.err.println("error." + ex.getMessage());
        }
    }

    @Override
    @Transactional
    public void modificarPersona(Persona persona) {
        try {
            getiPersonaDao().modificarPersona(persona);
        } catch (Exception ex) {
            System.err.println("error." + ex.getMessage());
        }
    }

    @Override
    @Transactional
    public void eliminarPersona(Persona persona) {
        try {
            getiPersonaDao().eliminarPersona(persona);
        } catch (Exception ex) {
            System.err.println("error." + ex.getMessage());
        }
    }

    public IPersonaDao getiPersonaDao() {
        return iPersonaDao;
    }

    public void setiPersonaDao(IPersonaDao iPersonaDao) {
        this.iPersonaDao = iPersonaDao;
    }

}
