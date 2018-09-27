/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.implementacion;

import com.exception.EjecucionException;
import com.interfaces.IFisica;
import org.springframework.stereotype.Component;

/**
 *
 * @author admin
 */
@Component("idMovimientoRectilineo")
public class MovimientoRectilineo implements IFisica{

    @Override
    public void enseniarFsicaPractica() throws EjecucionException {
        String experimentoPractico= "SE REALIZA  UN EXPERIMENTO PRACTCO de fisica";
        System.out.println("experimento practico: "+ experimentoPractico);
        
        
    }
    
}
