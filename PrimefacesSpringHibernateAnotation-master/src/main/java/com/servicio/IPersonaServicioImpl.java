/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servicio;

import java.util.List;
import com.dao.IPersonaDao;
import com.modelo.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("IPersonaServicioImpl")
@Transactional(readOnly = true)
public class IPersonaServicioImpl implements IPersonaServicio {

    @Autowired
    IPersonaDao IPersonaDao;

    @Override
    public List<Persona> listarPersonas() {
        return getIPersonaDao().listarPersonas();
    }

    @Override
    public Persona recuperarPersonaPorId(int idPersona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Persona recuperarPersonaPorNombre(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Transactional
    public void agregarPersona(Persona persona) {
        getIPersonaDao().agregarPersona(persona);
    }

    @Override
    public void modificarPersona(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarPersona(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long contadorPersonas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public IPersonaDao getIPersonaDao() {
        return IPersonaDao;
    }

    public void setIPersonaDao(IPersonaDao IPersonaDao) {
        this.IPersonaDao = IPersonaDao;
    }

}
