/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exception;

/**
 *
 * @author admin
 */
public class EjecucionException extends RuntimeException{

    public EjecucionException() {
    //super();
    }
    
    public EjecucionException(String sms) {
        super(sms);
    }
    
}
