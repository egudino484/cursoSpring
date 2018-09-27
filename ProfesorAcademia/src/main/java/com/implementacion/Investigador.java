/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.implementacion;

import com.exception.EjecucionException;
import com.interfaces.IConsejoInvestigacion;
import com.interfaces.IInstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * @author admin
 */
@Component ("idInvestigador") /*con @Component ya es un bean de Spring*/

public class Investigador implements IInstructor{
     @Value("Asignar profesores")
     private String decisionAdministrativa;
     
     @Autowired
     @Qualifier("idDepartamentoInvestigacion")
     private IConsejoInvestigacion consejoInvestigacion;
     
    @Override
    public void ejecutar() throws EjecucionException {
        System.out.println("Tomando decision administrativa: "+decisionAdministrativa);
        consejoInvestigacion.tomarDesicionesAdministrativas();
    }

    public Investigador() {
    }

    public String getDecisionAdministrativa() {
        return decisionAdministrativa;
    }

    public void setDecisionAdministrativa(String decisionAdministrativa) {
        this.decisionAdministrativa = decisionAdministrativa;
    }
    
    
    
}
