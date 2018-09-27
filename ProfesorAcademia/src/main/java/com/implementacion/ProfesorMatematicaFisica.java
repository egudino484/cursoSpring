/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.implementacion;

import com.interfaces.IFisica;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * @author admin
 */
@Component ("idProfesorMatematicaFisica")
public class ProfesorMatematicaFisica  extends Profesor{
    private IFisica iFisica;

    public ProfesorMatematicaFisica(IFisica iFisica) {
        super();
        this.iFisica = iFisica;
    }
    
    
        public ProfesorMatematicaFisica(@Value("3") int numeroAsignaturas/*, IFisica iFisica*/) {
        super(numeroAsignaturas);
       //this.iFisica = iFisica;
        
            System.out.println(" y tambien de  movimiento rectilineo");
            iFisica.enseniarFsicaPractica();
    }
    
    
}
