/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.implementacion;

import com.exception.EjecucionException;
import com.interfaces.IConsejoInvestigacion;
import org.springframework.stereotype.Component;

/**
 *
 * @author admin
 */
@Component ("idDepartamentoInvestigacion") /*con @Component ya es un bean de Spring*/
public class DepartamentoInvestigacion implements IConsejoInvestigacion{

    @Override
    public void tomarDesicionesAdministrativas() throws EjecucionException {
        System.out.println("Asignar profesores para investigar");    
        
    }
    
}
