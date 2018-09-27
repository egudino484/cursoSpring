/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.implementacion;

import com.exception.EjecucionException;
import com.interfaces.IInstructor;
import org.springframework.stereotype.Component;

/**
 *
 * @author admin
 */
@Component("idProfesor")
public class Profesor implements IInstructor{
    private int numAsignaturas= 2;
    public Profesor() {
    }
   public Profesor(int numAsignaturas) {
       this.numAsignaturas=numAsignaturas;
    }
    @Override
    public void ejecutar() throws EjecucionException {
        System.out.println("Enseño "+numAsignaturas+ " de temas de matematica");
    }

    public int getNumAsignaturas() {
        return numAsignaturas;
    }

    public void setNumAsignaturas(int numAsignaturas) {
        this.numAsignaturas = numAsignaturas;
    }
    
}
