/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interfaces;

import com.exception.EjecucionException;
import org.springframework.beans.factory.annotation.Value;

/**
 *
 * @author admin
 */
public interface IConsejoInvestigacion {
   
     public void tomarDesicionesAdministrativas() throws EjecucionException;
}
