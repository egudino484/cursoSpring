/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.implementacion;

import com.exception.EjecucionException;
import com.interfaces.IConsejoInvestigacion;

/**
 *
 * @author admin
 */
public class DepartamentoDisciplina  implements IConsejoInvestigacion{

    @Override
    public void tomarDesicionesAdministrativas() throws EjecucionException {
        System.out.println("Sancionar a profesores");
    }
    
}
