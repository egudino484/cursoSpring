/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.modelo.Persona;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class IPersonaDaoImpl implements IPersonaDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Persona> listarPersonas() {
        try {
            List list = sessionFactory.getCurrentSession().createQuery("from com.modelo.Persona ").list();
            return list;
        } catch (Exception ex) {
            System.err.println("error:." + ex.getMessage());
            return null;

        }
    }

    @Override
    public Persona recuperarPersonaPorId(int idPersona) {
        try {
            Object obj = sessionFactory.getCurrentSession().createQuery("select obj form Persona obj "
                    + " where obj.idPersona=" + idPersona + "").uniqueResult();
            return (Persona) obj;
        } catch (Exception ex) {
            System.err.println("error:." + ex.getMessage());
            return null;

        }
    }

    @Override
    public void agregarPersona(Persona persona) {
        try {
            getSessionFactory().getCurrentSession().save(persona);
        } catch (Exception ex) {
            System.err.println("error:." + ex.getMessage());

        }

    }

    @Override
    public void modificarPersona(Persona persona) {
        try {
            getSessionFactory().getCurrentSession().update(persona);
        } catch (Exception ex) {
            System.err.println("error:." + ex.getMessage());

        }
    }

    @Override
    public void eliminarPersona(Persona persona) {
        try {
            getSessionFactory().getCurrentSession().delete(persona);
        } catch (Exception ex) {
            System.err.println("error:." + ex.getMessage());

        }
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

}
