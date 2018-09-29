/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.implementaciones;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 *
 * @author admin
 */
@Component 
@Aspect
public class Estudiante {
    


 


    public void sentarse() { 


        System.out.println("estudiante: las clases estan por comenzar, por favor tomar asiento"); 


    } 


 


    public void apagarCelulares() { 


        System.out.println("estudiante: Por favor apagar los celulares"); 


    } 


 


    public void realizarPreguntas() { 


        System.out.println("estudiante: las clases han finalizado, realizar preguntas"); 


    } 


 


    public void salirDelAula() { 


        System.out.println("estudiante: las clases se han concluido, salir del aula"); 


    } 
    @Pointcut ("execution( * com.implementaciones.Profesor.ejecutar(..))")
    public  void impartirClases() {
        
    }
 

    @Around("impartirClases()")
    public void monitorearClasesMatematica(ProceedingJoinPoint joinjPoint) { 


        try { 

 System.out.println("\n*******************************************");
            System.out.println("las clases estan por comenzar, por favor tomar asiento"); 


            System.out.println("Por favor apagar los celulares"); 


            long horaInicio = System.currentTimeMillis();//hora de inicio 


            //se llama almetodo de negocio (metodo objetivo) 


            


            Thread.sleep(1000); 


            //1 segundo 


            //Este delay enmilisegundos  es opcional y se puede poner en los metodos de negocio para simular la duracion delmetodo 


            System.out.println("las clases han finalizado, por favor realizar preguntas"); 


            long horaTermino = System.currentTimeMillis(); 


            System.out.println("las clases duraron:" + (horaTermino - horaInicio)); 


// ejecutar el otro proceso al que se hace referencia en el aplicaction context en este caso el ejecutar();
//joinjPoint.proceed(); //ejecutar el metodo interceptado solo cuando uso un around para interceptar 

        } catch (Throwable t) { 


            System.out.println("Los alumnos han finalizado las clases."); 


        } 
 System.out.println("\n*******************************************");


    }
    



 
}
