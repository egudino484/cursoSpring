/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import java.util.List;
import com.modelo.Persona;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class IPersonaDaoImpl implements IPersonaDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Persona recuperarPersonaPorId(int idPersona) {
        try {
            Object obj= sessionFactory.getCurrentSession().createQuery("select obj from persona obj where obj.idPersona="+idPersona).uniqueResult();
            return  (Persona) obj;
        } catch (Exception e) {
            System.err.println("error"+ e.getMessage() );
            return null;
            
        }

    }

    @Override
    public Persona recuperarPersonaPorNombre(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void agregarPersona(Persona persona) {
        try {
                    getSessionFactory().getCurrentSession().save(persona);

        } catch (Exception e) {
              System.err.println("error"+ e.getMessage() );
            
        }
        
    }

    @Override
    public void modificarPersona(Persona persona) {
        try {
                    getSessionFactory().getCurrentSession().update(persona);

        } catch (Exception e) {
              System.err.println("error"+ e.getMessage() );
            
        }    }

    @Override
    public void eliminarPersona(Persona persona) {
        try {
                    getSessionFactory().getCurrentSession().delete(persona);

        } catch (Exception e) {
              System.err.println("error"+ e.getMessage() );
            
        }    }

    @Override
    public long contadorPersonas() {
        List list = getSessionFactory().getCurrentSession().createQuery("from Persona").list();
        return list.size();
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Persona> listarPersonas() {
        List list = getSessionFactory().getCurrentSession().createQuery("from Persona").list();
        return list;
    }

}
